package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单页面地址信息
 *
 * @author auto create
 * @since 1.0, 2025-06-10 11:42:10
 */
public class RentPathInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7592315386496413133L;

	/**
	 * 商家有独立页面用于支持用户发起租赁商品购买时，可传入此字段。用户在芝麻租赁频道发起购买时，将引导用户跳转至该页面完成操作。
	 */
	@ApiField("buyout_path")
	private String buyoutPath;

	/**
	 * 商家小程序对应的订单详情页路径地址 value。仅需传入小程序页面路径即可。同一笔订单的链接必须与第一次传入的地址相同，且需是小程序内部页面路径
	 */
	@ApiField("detail_path")
	private String detailPath;

	/**
	 * 租赁服务协议
	 */
	@ApiListField("protocols")
	@ApiField("rent_service_protocol_d_t_o")
	private List<RentServiceProtocolDTO> protocols;

	/**
	 * 商家有独立页面用于支持用户发起租赁商品续租时，可传入此字段。用户在芝麻租赁频道发起购买时，将引导用户跳转至该页面完成操作。
	 */
	@ApiField("relet_path")
	private String reletPath;

	/**
	 * 商家有独立页面用于支持用户发起租赁商品归还时，可传入此字段。用户在芝麻租赁频道发起购买时，将引导用户跳转至该页面完成操作。
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

	public List<RentServiceProtocolDTO> getProtocols() {
		return this.protocols;
	}
	public void setProtocols(List<RentServiceProtocolDTO> protocols) {
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
