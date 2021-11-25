package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业场景数据页面发送
 *
 * @author auto create
 * @since 1.0, 2018-06-01 16:07:28
 */
public class AlipayCommerceDataResultSendModel extends AlipayObject {

	private static final long serialVersionUID = 5779676796683676445L;

	/**
	 * 请求来源
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 版本号，由支付宝分配
	 */
	@ApiField("interface_version")
	private String interfaceVersion;

	/**
	 * 操作code,由支付宝分配
	 */
	@ApiField("op_code")
	private String opCode;

	/**
	 * 结果码，由支付宝分配，该结果码将对应不同的页面展示
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 场景code，由支付宝分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景的数据表示. json 数组格式，
根据不同的scene_code,op_code,
channel,version共同确定参数是否
可以为空，接入时由支付宝确定
参数格式。
	 */
	@ApiField("scene_data")
	private String sceneData;

	/**
	 * 通知的目标用户
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 取值范围：
IDENTITY_CARD_NO ：身份证
ALIPAY_LOGON_ID:支付宝登录账号
BINDING_MOBILE_NO:支付宝账号绑定的手机号
 ALIPAY_USER_ID：支付宝user_id
标明target_id对应的类型，此参数为空时，
默认为支付宝账号的user_id。
注意：类型为身份证、支付宝绑定的手机号时，
可能对应多个支付宝账号，此时只会选择列表
第一个支付宝账号的userId作为targetId使用。
	 */
	@ApiField("target_id_type")
	private String targetIdType;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getInterfaceVersion() {
		return this.interfaceVersion;
	}
	public void setInterfaceVersion(String interfaceVersion) {
		this.interfaceVersion = interfaceVersion;
	}

	public String getOpCode() {
		return this.opCode;
	}
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneData() {
		return this.sceneData;
	}
	public void setSceneData(String sceneData) {
		this.sceneData = sceneData;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetIdType() {
		return this.targetIdType;
	}
	public void setTargetIdType(String targetIdType) {
		this.targetIdType = targetIdType;
	}

}
