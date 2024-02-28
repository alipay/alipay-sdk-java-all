package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付后推荐创建方案
 *
 * @author auto create
 * @since 1.0, 2019-10-22 20:28:25
 */
public class AlipayOpenMiniPlanOperateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7882342191864336757L;

	/**
	 * 描述支付后推荐的应用是否属于当前账号，该字段只做展示用, 不应用于业务逻辑, 若属于当前账号则设置为OWN，否则设置为OTHERS, 无法判断的场景传 DEFAULT 即可
	 */
	@ApiField("app_belong")
	private String appBelong;

	/**
	 * 收藏有礼活动id，用于绑定支付成功页的有礼活动id
	 */
	@ApiField("gift_template_id")
	private String giftTemplateId;

	/**
	 * 支付后推荐代运营的应用id，若type=PUBLICAPP，则为生活号id，若type=TINYAPP，则为小程序id
	 */
	@ApiField("oper_app_id")
	private String operAppId;

	/**
	 * 指定创建方案的 pid, 该字段仅白名单应用可用, 其他情况下会被忽略
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 投放配置场景内容
	 */
	@ApiListField("plan_content")
	@ApiField("plan_operate_content")
	private List<PlanOperateContent> planContent;

	/**
	 * 支付后推荐用于标识方案的名称，方便管理
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 小程序投放方案场景码，目前只支持支付后推荐场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 可用的服务能力标签列表。可选的服务能力标签，请参考
	 */
	@ApiListField("service_list")
	@ApiField("string")
	private List<String> serviceList;

	/**
	 * 用于标识支付后推荐的类型，目前只支持小程序和生活号推荐。目前可填的枚举值如下:"TINYAPP"(小程序)，"PUBLICAPP"(生活号), "IOT_MEMBER_CARD" (IOT支付后会员卡开卡)
	 */
	@ApiField("type")
	private String type;

	public String getAppBelong() {
		return this.appBelong;
	}
	public void setAppBelong(String appBelong) {
		this.appBelong = appBelong;
	}

	public String getGiftTemplateId() {
		return this.giftTemplateId;
	}
	public void setGiftTemplateId(String giftTemplateId) {
		this.giftTemplateId = giftTemplateId;
	}

	public String getOperAppId() {
		return this.operAppId;
	}
	public void setOperAppId(String operAppId) {
		this.operAppId = operAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<PlanOperateContent> getPlanContent() {
		return this.planContent;
	}
	public void setPlanContent(List<PlanOperateContent> planContent) {
		this.planContent = planContent;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public List<String> getServiceList() {
		return this.serviceList;
	}
	public void setServiceList(List<String> serviceList) {
		this.serviceList = serviceList;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
