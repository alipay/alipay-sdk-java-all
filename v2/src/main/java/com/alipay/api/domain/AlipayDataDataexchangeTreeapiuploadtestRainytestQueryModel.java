package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * tree模型的openApi类型测试接口260820
 *
 * @author auto create
 * @since 1.0, 2026-08-21 16:36:31
 */
public class AlipayDataDataexchangeTreeapiuploadtestRainytestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2891454717654976548L;

	/**
	 * test case
	 */
	@ApiField("choose")
	private String choose;

	/**
	 * test case
	 */
	@ApiField("choose_one_1")
	private String chooseOne1;

	/**
	 * test case
	 */
	@ApiField("choose_one_2")
	private String chooseOne2;

	/**
	 * 测试数据
	 */
	@ApiListField("demo")
	@ApiField("rainy_public_for_upload_test_complex_info")
	private List<RainyPublicForUploadTestComplexInfo> demo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChoose() {
		return this.choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
	}

	public String getChooseOne1() {
		return this.chooseOne1;
	}
	public void setChooseOne1(String chooseOne1) {
		this.chooseOne1 = chooseOne1;
	}

	public String getChooseOne2() {
		return this.chooseOne2;
	}
	public void setChooseOne2(String chooseOne2) {
		this.chooseOne2 = chooseOne2;
	}

	public List<RainyPublicForUploadTestComplexInfo> getDemo() {
		return this.demo;
	}
	public void setDemo(List<RainyPublicForUploadTestComplexInfo> demo) {
		this.demo = demo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
