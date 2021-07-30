package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 儿童账户修改
 *
 * @author auto create
 * @since 1.0, 2020-07-10 18:34:48
 */
public class AlipayCommerceKidsAccountModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6865858546859784781L;

	/**
	 * 格式为yyyy-MM-dd，需要满足18周岁以下（不包含18周岁生日当天）
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 手机号码, 目前仅支持13位大陆手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 请输入真实姓名，需满足五个以内汉字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 第三方业务id，需保证唯一或者和业务类型组合保证唯一，用于关联上传到支付宝的数据，比如在智能设备场景通常使用硬件唯一id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 外围业务类型，比如智能设备场景表示设备型号
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 场景码，接入前需进行申请
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
