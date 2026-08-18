package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 渠道权益卡服务开通
 *
 * @author auto create
 * @since 1.0, 2026-08-04 11:22:25
 */
public class AlipayCommerceMedicalInsuranceFulfillmenttransitSaveModel extends AlipayObject {

	private static final long serialVersionUID = 3845521973178373568L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * null
	 */
	@ApiListField("out_unique_biz_no_list")
	@ApiField("string")
	private List<String> outUniqueBizNoList;

	/**
	 * 产品编号
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 服务失效时间
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 服务生效时间
	 */
	@ApiField("valid_start_time")
	private Date validStartTime;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<String> getOutUniqueBizNoList() {
		return this.outUniqueBizNoList;
	}
	public void setOutUniqueBizNoList(List<String> outUniqueBizNoList) {
		this.outUniqueBizNoList = outUniqueBizNoList;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

	public Date getValidStartTime() {
		return this.validStartTime;
	}
	public void setValidStartTime(Date validStartTime) {
		this.validStartTime = validStartTime;
	}

}
