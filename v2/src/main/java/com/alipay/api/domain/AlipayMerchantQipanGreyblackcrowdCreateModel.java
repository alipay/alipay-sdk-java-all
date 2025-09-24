package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 上传创建灰黑产人群
 *
 * @author auto create
 * @since 1.0, 2025-02-24 10:54:20
 */
public class AlipayMerchantQipanGreyblackcrowdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7396176394795358133L;

	/**
	 * 支付宝人群描述
	 */
	@ApiField("crowd_desc")
	private String crowdDesc;

	/**
	 * 人群名称 最大长度为15个字符
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 商户外部用户人群code 用于标识商家人群，需保证同一商户下crowd_code唯一
	 */
	@ApiField("external_crowd_code")
	private String externalCrowdCode;

	/**
	 * 表示人群的类型
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 人群包含的用户列表 单次上传用户数上限为1000，若用户量过大可分批通过alipay.merchant.qipan.greyblackcrowduser.add接口上传
	 */
	@ApiListField("user_list")
	@ApiField("qipan_grey_black_crowd_user")
	private List<QipanGreyBlackCrowdUser> userList;

	public String getCrowdDesc() {
		return this.crowdDesc;
	}
	public void setCrowdDesc(String crowdDesc) {
		this.crowdDesc = crowdDesc;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public String getExternalCrowdCode() {
		return this.externalCrowdCode;
	}
	public void setExternalCrowdCode(String externalCrowdCode) {
		this.externalCrowdCode = externalCrowdCode;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public List<QipanGreyBlackCrowdUser> getUserList() {
		return this.userList;
	}
	public void setUserList(List<QipanGreyBlackCrowdUser> userList) {
		this.userList = userList;
	}

}
