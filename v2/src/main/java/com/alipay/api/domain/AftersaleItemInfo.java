package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品列表
 *
 * @author auto create
 * @since 1.0, 2026-04-17 19:14:34
 */
public class AftersaleItemInfo extends AlipayObject {

	private static final long serialVersionUID = 3312877319488734728L;

	/**
	 * 售后凭证信息
	 */
	@ApiListField("certificate_vo_list")
	@ApiField("aftersale_certificate_info")
	private List<AftersaleCertificateInfo> certificateVoList;

	/**
	 * 商品数量,单位:"个"
	 */
	@ApiField("item_cnt")
	private String itemCnt;

	/**
	 * 外部商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部skuid
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public List<AftersaleCertificateInfo> getCertificateVoList() {
		return this.certificateVoList;
	}
	public void setCertificateVoList(List<AftersaleCertificateInfo> certificateVoList) {
		this.certificateVoList = certificateVoList;
	}

	public String getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(String itemCnt) {
		this.itemCnt = itemCnt;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
