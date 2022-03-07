package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告推广用于参与接口
 *
 * @author auto create
 * @since 1.0, 2017-08-25 14:54:44
 */
public class KoubeiAdvertCommissionAdvertPurchaseModel extends AlipayObject {

	private static final long serialVersionUID = 3781611592549267119L;

	/**
	 * 渠道ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 外部用户唯一标识(用于生成校验码，只有白名单ISV才可不填)
	 */
	@ApiField("out_unique_id")
	private String outUniqueId;

	/**
	 * 校验码（只有白名单ISV才可不填）

生成地址：
  http://pin.aliyun.com/get_img
参数：
  sessionid-外部用户唯一标识(和上面的out_unique_id保持一致)
  identity-固定值，请输入kbadvert
  type-验证码图片类型
【type取值说明】
  type - 内容 - 尺寸
  default - 4位数字&大小写 - 100x30
  number - 6位纯数字 - 100x30
  150_40 - 4位数字&大小写 - 150x40

请求示例：http://pin.aliyun.com/get_img?sessionid=13000000000&identity=kbadvert&type=default

验证码校验地址示例：http://pin.aliyun.com/check_code?sessionid=13000000000&identity=kbadvert&code=PNRT
	 */
	@ApiField("security_code")
	private String securityCode;

	/**
	 * 推广参与打标(无实际业务作用，后期可供ISV分析不同渠道的推广效能)
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 参与主键列表
trigger_identify_type=advert所有值都必须是广告ID
	 */
	@ApiListField("trigger_identifies")
	@ApiField("string")
	private List<String> triggerIdentifies;

	/**
	 * 参与主键类型
advert-广告ID
delivery_id-外投ID（通过koubei.advert.delivery.discount.batchquery接口获取的外投ID）
	 */
	@ApiField("trigger_identify_type")
	private String triggerIdentifyType;

	/**
	 * 用户领取券策略
FIRST_CAN_PURCHASE：第一个可领
ALL_PURCHASE：领取所有（默认）
	 */
	@ApiField("trigger_strategy")
	private String triggerStrategy;

	/**
	 * 用户身份主键
user_identify_type=phone-值必须是用户手机号
	 */
	@ApiField("user_identify")
	private String userIdentify;

	/**
	 * 用户身份主键类型
phone-手机号
user_id - 支付宝账户ID
	 */
	@ApiField("user_identify_type")
	private String userIdentifyType;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getOutUniqueId() {
		return this.outUniqueId;
	}
	public void setOutUniqueId(String outUniqueId) {
		this.outUniqueId = outUniqueId;
	}

	public String getSecurityCode() {
		return this.securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<String> getTriggerIdentifies() {
		return this.triggerIdentifies;
	}
	public void setTriggerIdentifies(List<String> triggerIdentifies) {
		this.triggerIdentifies = triggerIdentifies;
	}

	public String getTriggerIdentifyType() {
		return this.triggerIdentifyType;
	}
	public void setTriggerIdentifyType(String triggerIdentifyType) {
		this.triggerIdentifyType = triggerIdentifyType;
	}

	public String getTriggerStrategy() {
		return this.triggerStrategy;
	}
	public void setTriggerStrategy(String triggerStrategy) {
		this.triggerStrategy = triggerStrategy;
	}

	public String getUserIdentify() {
		return this.userIdentify;
	}
	public void setUserIdentify(String userIdentify) {
		this.userIdentify = userIdentify;
	}

	public String getUserIdentifyType() {
		return this.userIdentifyType;
	}
	public void setUserIdentifyType(String userIdentifyType) {
		this.userIdentifyType = userIdentifyType;
	}

}
