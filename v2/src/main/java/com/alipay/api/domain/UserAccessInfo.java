package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人传人短信商户模型
 *
 * @author auto create
 * @since 1.0, 2024-10-31 20:52:11
 */
public class UserAccessInfo extends AlipayObject {

	private static final long serialVersionUID = 3128182239521675311L;

	/**
	 * 人传人短信用户查询手机号
	 */
	@ApiField("tel_num")
	private String telNum;

	/**
	 * 用户圈选信息
	 */
	@ApiListField("user_segmentation_info")
	@ApiField("user_segmentation_info")
	private List<UserSegmentationInfo> userSegmentationInfo;

	public String getTelNum() {
		return this.telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public List<UserSegmentationInfo> getUserSegmentationInfo() {
		return this.userSegmentationInfo;
	}
	public void setUserSegmentationInfo(List<UserSegmentationInfo> userSegmentationInfo) {
		this.userSegmentationInfo = userSegmentationInfo;
	}

}
