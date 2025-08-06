package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单页面地址信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:11:58
 */
public class RentPathInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1266592744634237525L;

	/**
	 * 商家租赁订单购买页地址
	 */
	@ApiField("buyout_path")
	private String buyoutPath;

	/**
	 * 商家小程序对应的订单详情页路径地址
	 */
	@ApiField("detail_path")
	private String detailPath;

	/**
	 * 租赁服务协议
	 */
	@ApiListField("protocols")
	@ApiField("rent_service_protocol_v_o")
	private List<RentServiceProtocolVO> protocols;

	/**
	 * 商家租赁订单续租页地址
	 */
	@ApiField("relet_path")
	private String reletPath;

	/**
	 * 商家租赁订单归还页地址
	 */
	@ApiField("return_path")
	private String returnPath;

	public String getBuyoutPath() {
		return this.buyoutPath;
	}
	public void setBuyoutPath(String buyoutPath) {
		this.buyoutPath = buyoutPath;
	}

	public String getDetailPath() {
		return this.detailPath;
	}
	public void setDetailPath(String detailPath) {
		this.detailPath = detailPath;
	}

	public List<RentServiceProtocolVO> getProtocols() {
		return this.protocols;
	}
	public void setProtocols(List<RentServiceProtocolVO> protocols) {
		this.protocols = protocols;
	}

	public String getReletPath() {
		return this.reletPath;
	}
	public void setReletPath(String reletPath) {
		this.reletPath = reletPath;
	}

	public String getReturnPath() {
		return this.returnPath;
	}
	public void setReturnPath(String returnPath) {
		this.returnPath = returnPath;
	}

}
