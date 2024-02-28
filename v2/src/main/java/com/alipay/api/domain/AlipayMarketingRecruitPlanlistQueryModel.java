package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询可报名的方案列表
 *
 * @author auto create
 * @since 1.0, 2023-10-08 09:58:00
 */
public class AlipayMarketingRecruitPlanlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7546944434397465452L;

	/**
	 * "查询可报名方案的目标商户信息。 说明： 如果该复杂对象不填。则默认为是查询调用者本人。 如果填写，则认为是查询该商户。 建议:服务商身份接入时必传，否则可报名方案不是针对代运营商户的。"
	 */
	@ApiField("enroll_merchant")
	private RecruitEnrollMerchant enrollMerchant;

	/**
	 * 活动报名场景配置。 
枚举值：
VOUCHER：券报名场景查询；
MINI_APP：小程序报名场景查询；
VOUCHER,MINI_APP：同时进行券报名场景和小程序报名场景的查询；
	 */
	@ApiField("enroll_scene_type")
	private String enrollSceneType;

	/**
	 * 第几页，默认1（需要在1和999之间）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，默认20，需要在1和100之间
	 */
	@ApiField("page_size")
	private Long pageSize;

	public RecruitEnrollMerchant getEnrollMerchant() {
		return this.enrollMerchant;
	}
	public void setEnrollMerchant(RecruitEnrollMerchant enrollMerchant) {
		this.enrollMerchant = enrollMerchant;
	}

	public String getEnrollSceneType() {
		return this.enrollSceneType;
	}
	public void setEnrollSceneType(String enrollSceneType) {
		this.enrollSceneType = enrollSceneType;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
