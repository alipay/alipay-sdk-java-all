package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务数据，类型为ObjKLineDTOWrapper
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:46
 */
public class ObjKLineDTO extends AlipayObject {

	private static final long serialVersionUID = 3132338831875494917L;

	/**
	 * null
	 */
	@ApiListField("list")
	@ApiField("k_line_list_d_t_o")
	private List<KLineListDTO> list;

	/**
	 * K线周期类型:
  // 1 分钟
  P_Min1
    // 5 分钟  
    P_Min5
    // 15 分钟
    P_Min15
    // 30 分钟 
    P_Min30
    // 60 分钟  
    P_Min60
    // 日 
    P_Day1
    // 周 
    P_Week1
    // 月 
    P_Month1
	 */
	@ApiField("period")
	private String period;

	/**
	 * * 复权类型
     * 前复权   =  S_Before
     * 后复权   =  S_After
     * 不复权   =  S_Unsplit
	 */
	@ApiField("split")
	private String split;

	/**
	 * 股票代码
	 */
	@ApiField("symbol")
	private String symbol;

	public List<KLineListDTO> getList() {
		return this.list;
	}
	public void setList(List<KLineListDTO> list) {
		this.list = list;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getSplit() {
		return this.split;
	}
	public void setSplit(String split) {
		this.split = split;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
