package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiFamilyInfoVO;
import com.alipay.api.domain.OpenApiSkuInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antstarship.home.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:21:55
 */
public class AlipayUserAntstarshipHomeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4642346191923624138L;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 全家福信息
	 */
	@ApiField("family_info")
	private OpenApiFamilyInfoVO familyInfo;

	/** 
	 * sku列表信息
	 */
	@ApiListField("sku_info_list")
	@ApiField("open_api_sku_info_v_o")
	private List<OpenApiSkuInfoVO> skuInfoList;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setFamilyInfo(OpenApiFamilyInfoVO familyInfo) {
		this.familyInfo = familyInfo;
	}
	public OpenApiFamilyInfoVO getFamilyInfo( ) {
		return this.familyInfo;
	}

	public void setSkuInfoList(List<OpenApiSkuInfoVO> skuInfoList) {
		this.skuInfoList = skuInfoList;
	}
	public List<OpenApiSkuInfoVO> getSkuInfoList( ) {
		return this.skuInfoList;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

}
