package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询生活记录详情
 *
 * @author auto create
 * @since 1.0, 2025-02-21 14:39:11
 */
public class ZhimaCustomerLiferecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8275271355315957741L;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 支付宝userId的映射字段
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 根据外部业务号进行批量查询
	 */
	@ApiListField("out_biz_nos")
	@ApiField("string")
	private List<String> outBizNos;

	/**
	 * PROCESSING、UN_FINISH、CANCELED、FINISH，分别对应进行中、未完成、已取消、已完成
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	/**
	 * 任务模板id列表
	 */
	@ApiListField("template_ids")
	@ApiField("string")
	private List<String> templateIds;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOutBizNos() {
		return this.outBizNos;
	}
	public void setOutBizNos(List<String> outBizNos) {
		this.outBizNos = outBizNos;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

	public List<String> getTemplateIds() {
		return this.templateIds;
	}
	public void setTemplateIds(List<String> templateIds) {
		this.templateIds = templateIds;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
