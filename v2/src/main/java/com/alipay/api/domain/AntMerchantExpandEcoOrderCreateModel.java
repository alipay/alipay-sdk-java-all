package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV订单信息创建
 *
 * @author auto create
 * @since 1.0, 2024-05-22 11:36:42
 */
public class AntMerchantExpandEcoOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4158976617917613124L;

	/**
	 * 交易平台
	 */
	@ApiField("busi_platform")
	private String busiPlatform;

	/**
	 * 卖家编号
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 运单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 下单时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 交易平台订单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * osskey数组,将文件上传的返回的osskey一并上传
	 */
	@ApiListField("qrcode_imgs")
	@ApiField("string")
	private List<String> qrcodeImgs;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_code")
	private String shopCode;

	public String getBusiPlatform() {
		return this.busiPlatform;
	}
	public void setBusiPlatform(String busiPlatform) {
		this.busiPlatform = busiPlatform;
	}

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public List<String> getQrcodeImgs() {
		return this.qrcodeImgs;
	}
	public void setQrcodeImgs(List<String> qrcodeImgs) {
		this.qrcodeImgs = qrcodeImgs;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

}
