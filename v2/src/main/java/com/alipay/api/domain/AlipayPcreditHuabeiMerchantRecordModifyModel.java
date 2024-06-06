package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新版花呗分期商家贴息活动门店记录修改
 *
 * @author auto create
 * @since 1.0, 2023-09-01 17:16:54
 */
public class AlipayPcreditHuabeiMerchantRecordModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5244718369555935499L;

	/**
	 * 商户操作动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 贴息活动ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * 添加门店的列表
	 */
	@ApiListField("merchant_infos")
	@ApiField("hb_merchant_info")
	private List<HbMerchantInfo> merchantInfos;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}

	public List<HbMerchantInfo> getMerchantInfos() {
		return this.merchantInfos;
	}
	public void setMerchantInfos(List<HbMerchantInfo> merchantInfos) {
		this.merchantInfos = merchantInfos;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
