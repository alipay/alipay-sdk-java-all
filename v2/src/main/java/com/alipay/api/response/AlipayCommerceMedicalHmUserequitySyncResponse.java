package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HmEquityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hm.userequity.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-28 11:02:41
 */
public class AlipayCommerceMedicalHmUserequitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5364895177252248776L;

	/** 
	 * null
	 */
	@ApiListField("equity_info_list")
	@ApiField("hm_equity_info")
	private List<HmEquityInfo> equityInfoList;

	/** 
	 * 权益下发场景必填，支付宝后台生成后给出固定编码值
	 */
	@ApiField("equity_package_code")
	private String equityPackageCode;

	/** 
	 * 标识唯一一次权益下发
	 */
	@ApiField("out_biz_serial_no")
	private String outBizSerialNo;

	/** 
	 * 约定合作项目标识，支付宝后台生成后给出固定编码值
	 */
	@ApiField("project_tag")
	private String projectTag;

	/** 
	 * 健管系统用户唯一标识
	 */
	@ApiField("user_id")
	private String userId;

	public void setEquityInfoList(List<HmEquityInfo> equityInfoList) {
		this.equityInfoList = equityInfoList;
	}
	public List<HmEquityInfo> getEquityInfoList( ) {
		return this.equityInfoList;
	}

	public void setEquityPackageCode(String equityPackageCode) {
		this.equityPackageCode = equityPackageCode;
	}
	public String getEquityPackageCode( ) {
		return this.equityPackageCode;
	}

	public void setOutBizSerialNo(String outBizSerialNo) {
		this.outBizSerialNo = outBizSerialNo;
	}
	public String getOutBizSerialNo( ) {
		return this.outBizSerialNo;
	}

	public void setProjectTag(String projectTag) {
		this.projectTag = projectTag;
	}
	public String getProjectTag( ) {
		return this.projectTag;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
