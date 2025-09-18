package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家用户人群包创建
 *
 * @author auto create
 * @since 1.0, 2024-11-18 16:44:28
 */
public class AlipayMerchantQipanCrowdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6814359729528635749L;

	/**
	 * 安全应用范围，参考文档 <a href="https://opendocs.alipay.com/pre-open/04phhq" target="_blank">安全应用范围枚举</a>
<br> 未传值或传入渠道均非法时 采用默认渠道，默认渠道：支付结果页AA、繁星激励。<br> 传入值时，以商户入参为准。
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 支付宝人群描述
	 */
	@ApiField("crowd_desc")
	private String crowdDesc;

	/**
	 * 人群名称
最大长度为15个字符
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 商户外部用户人群code
用于标识商家人群，需保证同一商户下crowd_code唯一
	 */
	@ApiField("external_crowd_code")
	private String externalCrowdCode;

	/**
	 * 人群在支付宝棋盘站点是否可见,取值如下：
<li>true-支付宝站点<b>不可见</b></li>
<li>false-支付宝站点<b>可见，默认值</b></li>
使用说明：创建的人群后续需使用标签进行二次圈选，且本人群对商户不可见时可设置为true。
	 */
	@ApiField("hidden")
	private Boolean hidden;

	/**
	 * 人群包含的用户列表 单次上传用户数上限为1000，若用户量过大可分批通过alipay.merchant.qipan.crowduser.add接口上传
	 */
	@ApiListField("user_list")
	@ApiField("qipan_merchant_crowd_user")
	private List<QipanMerchantCrowdUser> userList;

	public List<String> getApplyChannelList() {
		return this.applyChannelList;
	}
	public void setApplyChannelList(List<String> applyChannelList) {
		this.applyChannelList = applyChannelList;
	}

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

	public Boolean getHidden() {
		return this.hidden;
	}
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public List<QipanMerchantCrowdUser> getUserList() {
		return this.userList;
	}
	public void setUserList(List<QipanMerchantCrowdUser> userList) {
		this.userList = userList;
	}

}
