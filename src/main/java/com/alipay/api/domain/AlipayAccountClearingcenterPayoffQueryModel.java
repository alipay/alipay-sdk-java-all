package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询解付登记薄信息
 *
 * @author auto create
 * @since 1.0, 2020-06-28 09:59:20
 */
public class AlipayAccountClearingcenterPayoffQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2544198527292774631L;

	/**
	 * 币种
用于查询解付登记薄
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 合作伙伴GKA英文名称
用于查询登记薄信息
	 */
	@ApiField("instid")
	private String instid;

	/**
	 * 禁用状态
查询被禁用的待解付登记薄
INIT("INIT", "初始"),
PAYOFFING("PAYOFFING", "解付中"),
PAYOFFED("PAYOFFED", "解付完成"),
BACKING("BACKING", "退汇中"),
BACKED("BACKED", "退汇完成"),
DEPRECAT("DEPRECAT", "弃用")
	 */
	@ApiField("status")
	private String status;

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInstid() {
		return this.instid;
	}
	public void setInstid(String instid) {
		this.instid = instid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
