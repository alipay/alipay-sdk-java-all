package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡列表查询
 *
 * @author auto create
 * @since 1.0, 2026-05-27 16:42:58
 */
public class AlipayCommerceTransportIndustryCardlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3826749211589626864L;

	/**
	 * 行业场景编码
	 */
	@ApiField("industry_scene")
	private String industryScene;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 合作方编码
	 */
	@ApiField("partner_code")
	private String partnerCode;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getIndustryScene() {
		return this.industryScene;
	}
	public void setIndustryScene(String industryScene) {
		this.industryScene = industryScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
