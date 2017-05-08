package com.unionpay.nx.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.json.GsonUtil;
import com.unionpay.nx.entity.Erweima;
import com.unionpay.nx.entity.User;
import com.unionpay.nx.services.EChartTest;
import com.unionpay.nx.services.MyService;
import com.unionpay.nx.utils.ReadExcel;
import com.unionpay.nx.utils.WDWUtil;

@Controller
@RequestMapping("/v1")
public class DisplayMsg {
	private static Logger logger = Logger.getLogger(DisplayMsg.class);

	@Autowired
	private MyService myService;

	@Autowired
	private EChartTest eChartTest;

	// 首页
	@RequestMapping("/main")
	public ModelAndView showMain() {
		logger.info("only for display !!!");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("main");
		return modelAndView;
	}

	// 年度指标
	@RequestMapping("/index1")
	public ModelAndView showIndex() {
		logger.info("only for display !!!");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index1");
		return modelAndView;
	}

	@RequestMapping("/showInfo")
	public ModelAndView showUser() {
		logger.info("only for test1 !!!");
		List<User> list = myService.getAllUser();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("showInfo");
		modelAndView.addObject("list", list);
		return modelAndView;
	}

	// 二维码交易笔数
	@RequestMapping("/erweima")
	public ModelAndView erweima() {
		logger.info("only for erweima !!!");
		List<Erweima> list = myService.getAllerweima();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("erweima");
		modelAndView.addObject("list", list);
		return modelAndView;
	}

	@RequestMapping("/uploadfile1")
	public ModelAndView uploadfile() {
		logger.info("only for uploadfile !!!");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("uploadfile");
		return modelAndView;
	}

	// 重要通知
	@RequestMapping("/message")
	public ModelAndView message() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("message");
		return modelAndView;
	}

	@RequestMapping("/eChart")
	public ModelAndView getEchart() {
		logger.info("only for EChart !!!");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test");
		return modelAndView;
	}

	/**
	 * 上传Excel,读取Excel中内容
	 * 
	 * @param file
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String batchimport(@RequestParam(value = "fileUpload") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		logger.info("ClientController ..batchimport() start");
		String Msg = null;
		boolean b = false;

		// 判断文件是否为空
		if (file == null) {
			Msg = "文件是为空！";
			request.getSession().setAttribute("msg", Msg);
			return "alert";
		}

		// 获取文件名
		String name = file.getOriginalFilename();

		// 进一步判断文件是否为空（即判断其大小是否为0或其名称是否为null）验证文件名是否合格
		long size = file.getSize();
		if (name == null || ("").equals(name) && size == 0 && !WDWUtil.validateExcel(name)) {
			Msg = "文件格式不正确！请使用.xls或.xlsx后缀文档。";
			request.getSession().setAttribute("msg", Msg);
			return "alert";
		}

		// 创建处理EXCEL
		ReadExcel readExcel = new ReadExcel();
		// 解析excel，获取客户信息集合。
		List<Erweima> erweimaList = readExcel.getExcelInfo(file);
		if (erweimaList != null && !erweimaList.toString().equals("[]") && erweimaList.size() >= 1) {
			b = true;
		}

		if (b) {
			// 迭代添加客户信息（注：实际上这里也可以直接将customerList集合作为参数，在Mybatis的相应映射文件中使用foreach标签进行批量添加。）
			for (Erweima erweima : erweimaList) {
				// 这里可以做添加数据库的功能
				System.out.println("第一个值：" + erweima.getPartner() + "\t第二个值：" + erweima.getMerchant() + "\t第三个值："
						+ erweima.getSum());
			}
			Msg = "批量导入EXCEL成功！";
			request.getSession().setAttribute("msg", Msg);
		} else {
			Msg = "批量导入EXCEL失败！";
			request.getSession().setAttribute("msg", Msg);
		}
		return "alert";
	}

}
