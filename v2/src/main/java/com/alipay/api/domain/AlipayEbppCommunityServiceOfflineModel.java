package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区申请下线接口
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:34:48
 */
public class AlipayEbppCommunityServiceOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 4878182716862923386L;

	/**
	 * 小区短名
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * THIRD_PARTY_COMMUNITY_JIAOFEI:物业缴费
CENTRAL_SCAN_CODE_PASS:中心化扫码通行
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
