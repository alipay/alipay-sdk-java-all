package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.welfareagoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:14:10
 */
public class AlipayDataMdaWelfareagofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2442954782372692339L;

	/** 
	 * 火苗捐赠总数
	 */
	@ApiField("donate_flame_cnt")
	private Long donateFlameCnt;

	/** 
	 * 捐赠小学
	 */
	@ApiField("donate_school")
	private Long donateSchool;

	/** 
	 * 火苗总数
	 */
	@ApiField("flame_cnt")
	private Long flameCnt;

	/** 
	 * 完成火苗捐赠人数
	 */
	@ApiField("total_donate_user")
	private Long totalDonateUser;

	/** 
	 * 获取火苗人数
	 */
	@ApiField("total_obtain_user")
	private Long totalObtainUser;

	public void setDonateFlameCnt(Long donateFlameCnt) {
		this.donateFlameCnt = donateFlameCnt;
	}
	public Long getDonateFlameCnt( ) {
		return this.donateFlameCnt;
	}

	public void setDonateSchool(Long donateSchool) {
		this.donateSchool = donateSchool;
	}
	public Long getDonateSchool( ) {
		return this.donateSchool;
	}

	public void setFlameCnt(Long flameCnt) {
		this.flameCnt = flameCnt;
	}
	public Long getFlameCnt( ) {
		return this.flameCnt;
	}

	public void setTotalDonateUser(Long totalDonateUser) {
		this.totalDonateUser = totalDonateUser;
	}
	public Long getTotalDonateUser( ) {
		return this.totalDonateUser;
	}

	public void setTotalObtainUser(Long totalObtainUser) {
		this.totalObtainUser = totalObtainUser;
	}
	public Long getTotalObtainUser( ) {
		return this.totalObtainUser;
	}

}
