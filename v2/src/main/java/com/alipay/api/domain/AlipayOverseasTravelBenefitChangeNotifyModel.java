package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * GN权益通知回调
 *
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:14
 */
public class AlipayOverseasTravelBenefitChangeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3114581765494614636L;

	/**
	 * 收单站在gn的id
	 */
	@ApiField("acquirer_id")
	private String acquirerId;

	/**
	 * 权益详情列表
	 */
	@ApiListField("benefit_detail_info_list")
	@ApiField("benefit_detail_info")
	private List<BenefitDetailInfo> benefitDetailInfoList;

	/**
	 * 发卡站在gn的id
	 */
	@ApiField("psp_id")
	private String pspId;

	public String getAcquirerId() {
		return this.acquirerId;
	}
	public void setAcquirerId(String acquirerId) {
		this.acquirerId = acquirerId;
	}

	public List<BenefitDetailInfo> getBenefitDetailInfoList() {
		return this.benefitDetailInfoList;
	}
	public void setBenefitDetailInfoList(List<BenefitDetailInfo> benefitDetailInfoList) {
		this.benefitDetailInfoList = benefitDetailInfoList;
	}

	public String getPspId() {
		return this.pspId;
	}
	public void setPspId(String pspId) {
		this.pspId = pspId;
	}

}
