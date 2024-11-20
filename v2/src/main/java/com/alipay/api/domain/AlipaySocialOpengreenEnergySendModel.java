package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 绿色开放平台能量发放
 *
 * @author auto create
 * @since 1.0, 2023-07-07 16:03:17
 */
public class AlipaySocialOpengreenEnergySendModel extends AlipayObject {

	private static final long serialVersionUID = 7247461922158236413L;

	/**
	 * 用户绿色行为时间戳，可选，如果不填，默认为请求接口时间，可用于识别用户行为时间，并根据时间生成对应的能量球
	 */
	@ApiField("action_time")
	private String actionTime;

	/**
	 * 业务唯一单号，描述用户每次绿色行为的标识，同一行为应保障bizNo相同，尽量不带有 "_" 符号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用户产生绿色行为的小程序id
	 */
	@ApiField("energy_app_id")
	private String energyAppId;

	/**
	 * 能量扩展信息，仅特殊能量场景需要传入，对接时可咨询森林技术同学
	 */
	@ApiListField("ext_info")
	@ApiField("energy_ext_request")
	private List<EnergyExtRequest> extInfo;

	/**
	 * 绿色行为描述
	 */
	@ApiListField("green_actions")
	@ApiField("green_action")
	private List<GreenAction> greenActions;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家的支付宝id，用于描述用户是在哪一个商家中进行的绿色行为，该信息需在绿色开放平台后台进行注册签约（签约注册请与技术、业务同学沟通）
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 请与对接方业务同学或森林业务同学确认source信息
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEnergyAppId() {
		return this.energyAppId;
	}
	public void setEnergyAppId(String energyAppId) {
		this.energyAppId = energyAppId;
	}

	public List<EnergyExtRequest> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<EnergyExtRequest> extInfo) {
		this.extInfo = extInfo;
	}

	public List<GreenAction> getGreenActions() {
		return this.greenActions;
	}
	public void setGreenActions(List<GreenAction> greenActions) {
		this.greenActions = greenActions;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
