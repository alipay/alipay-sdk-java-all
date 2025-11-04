package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品详情
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:48:53
 */
public class AlipayMerchantSolcreditserviceprodProductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2773977799672433465L;

	/**
	 * 商家编辑商品时自定义的编号
	 */
	@ApiField("out_product_no")
	private String outProductNo;

	/**
	 * 系统生成的商品编号
	 */
	@ApiField("product_no")
	private String productNo;

	/**
	 * 直付通进件得到的ID
	 */
	@ApiField("smid")
	private String smid;

	public String getOutProductNo() {
		return this.outProductNo;
	}
	public void setOutProductNo(String outProductNo) {
		this.outProductNo = outProductNo;
	}

	public String getProductNo() {
		return this.productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
