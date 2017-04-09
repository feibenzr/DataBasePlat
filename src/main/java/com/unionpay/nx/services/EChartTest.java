package com.unionpay.nx.services;

import org.springframework.stereotype.Service;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.PieData;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Pie;
@Service
public class EChartTest {
	public Option test() {
		Option option = new Option();
		option.title("测试使用").tooltip(Trigger.axis).legend("图例");
		option.xAxis(new ValueAxis().boundaryGap(0d,0.01));
		CategoryAxis category = new CategoryAxis();
		Bar bar = new Bar("柱状");
		Pie pie = new Pie("饼状");
		//测试数据1
		 category.data("test1");
		 bar.data(100);
		 pie.data(new PieData("test1",100));
		 
		//测试数据2
		 category.data("test2");
		 bar.data(50);
		 pie.data(new PieData("test2",50));
		 
		 option.yAxis(category);
		 pie.center(50,10).radius(100);
		 option.series(bar,pie);
		 option.grid().x(180);
		 return option;
		 
	}
}
