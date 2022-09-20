package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环保数据，不传为空时，认为没有环保行为
 *
 * @author auto create
 * @since 1.0, 2022-06-15 17:37:05
 */
public class EnviromentalInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1662371393975824579L;

	/**
	 * environmental_info不为空时,必填; 环保类型: A:减塑/不使用购 物袋; B:无纸质小票; C:直饮水; D:酒店绿色入住 E:酒 店-减碳-不洗涤; F:景区订单; G:高校订单; H:充电宝订单; I:物流订单; J:电子发票; K:停车缴费; L:酒店信用住
	 */
	@ApiField("environmental")
	private String environmental;

	/**
	 * environmental_info不为空时,必填; 环保行为内容字典值:
减塑/不使用购物袋:huanbaojiansu; 
无纸质小票(电子小票):dianzixiaopiao;
直饮水:zhiyinshui;  
酒店绿色入住:lvseruzhu;
减碳-酒店不洗涤:待定;  
景区订单-扫码购票:saomagoupiao; 
 高校订单:待定;
充电宝订单:chongdianbao;
物流订单:wangshangjijian;
酒店信用住:xinyongzhu
	 */
	@ApiField("environmental_ext")
	private String environmentalExt;

	public String getEnvironmental() {
		return this.environmental;
	}
	public void setEnvironmental(String environmental) {
		this.environmental = environmental;
	}

	public String getEnvironmentalExt() {
		return this.environmentalExt;
	}
	public void setEnvironmentalExt(String environmentalExt) {
		this.environmentalExt = environmentalExt;
	}

}
