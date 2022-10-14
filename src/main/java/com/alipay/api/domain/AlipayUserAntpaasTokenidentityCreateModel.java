package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于识别创建蚂蚁通行证，即创建匿名用户Id
 *
 * @author auto create
 * @since 1.0, 2018-10-15 15:12:29
 */
public class AlipayUserAntpaasTokenidentityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7731894786839179998L;

	/**
	 * 业务Id，如新零售场景下创建匿名淘宝账户时的品牌商Id。
如果该值为空，则底层创建匿名账户时以 biz_scene + mobile 进行幂等
如果该值非空，则底层创建匿名账户Id时以 biz_scene + mobile + biz_id 进行幂等。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务域场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 额外附加信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 附加信息Id，如淘宝虚拟账号Id
	 */
	@ApiField("ext_info_id")
	private String extInfoId;

	/**
	 * 手机号码，1864234324324
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 1-企业 2-个人
	 */
	@ApiField("user_type")
	private String userType;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExtInfoId() {
		return this.extInfoId;
	}
	public void setExtInfoId(String extInfoId) {
		this.extInfoId = extInfoId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
