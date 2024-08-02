package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 网关测试接口——openid升级测试
 *
 * @author auto create
 * @since 1.0, 2023-08-17 15:57:41
 */
public class AlipayOpenOperationOpenbizmockOpenidtestingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2243323412651283115L;

	/**
	 * 详细地址 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("appid_one")
	@Deprecated
	private String appidOne;

	/**
	 * appid_out_one 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("appid_out_one")
	@Deprecated
	private String appidOutOne;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("appid_out_three")
	@Deprecated
	private String appidOutThree;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("appid_out_two")
	@Deprecated
	private String appidOutTwo;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("appid_three")
	@Deprecated
	private String appidThree;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("appid_two")
	@Deprecated
	private String appidTwo;

	/**
	 * adadsad
	 */
	@ApiField("extra_json")
	private String extraJson;

	/**
	 * xxx
	 */
	@ApiField("extra_json_1")
	private String extraJson1;

	/**
	 * 111
	 */
	@ApiField("lalala_openid")
	private String lalalaOpenid;

	/**
	 * 营业执照有效期
	 */
	@ApiField("lalala_real_open_id")
	private String lalalaRealOpenId;

	/**
	 * 营业执照有效期
	 */
	@ApiField("lalalala")
	private String lalalala;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("one_open_id")
	@Deprecated
	private String oneOpenId;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("one_uid")
	@Deprecated
	private String oneUid;

	/**
	 * uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1 当前字段已废弃(lalalalalalala)
	 */
	@ApiField("result_oneuid_original")
	@Deprecated
	private String resultOneuidOriginal;

	/**
	 * ceshi
	 */
	@ApiField("test")
	private OpenidComplex test;

	/**
	 * 测试循环嵌套含有json数组和对象
	 */
	@ApiField("test_json")
	private String testJson;

	/**
	 * 1
	 */
	@ApiField("test_wrong")
	private String testWrong;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("three_open_id")
	@Deprecated
	private String threeOpenId;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("three_uid")
	@Deprecated
	private String threeUid;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("two_open_id")
	@Deprecated
	private String twoOpenId;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiField("two_uid")
	@Deprecated
	private String twoUid;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此原来如此)
	 */
	@ApiListField("uid_list")
	@ApiField("string")
	@Deprecated
	private List<String> uidList;

	/**
	 * 1 当前字段已废弃(原来如此原来如此原来如此)
	 */
	@ApiListField("uid_list_open_id_list")
	@ApiField("string")
	@Deprecated
	private List<String> uidListOpenIdList;

	/**
	 * xxx
	 */
	@ApiField("user_detail")
	private UserDetail userDetail;

	/**
	 * uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppidOne() {
		return this.appidOne;
	}
	public void setAppidOne(String appidOne) {
		this.appidOne = appidOne;
	}

	public String getAppidOutOne() {
		return this.appidOutOne;
	}
	public void setAppidOutOne(String appidOutOne) {
		this.appidOutOne = appidOutOne;
	}

	public String getAppidOutThree() {
		return this.appidOutThree;
	}
	public void setAppidOutThree(String appidOutThree) {
		this.appidOutThree = appidOutThree;
	}

	public String getAppidOutTwo() {
		return this.appidOutTwo;
	}
	public void setAppidOutTwo(String appidOutTwo) {
		this.appidOutTwo = appidOutTwo;
	}

	public String getAppidThree() {
		return this.appidThree;
	}
	public void setAppidThree(String appidThree) {
		this.appidThree = appidThree;
	}

	public String getAppidTwo() {
		return this.appidTwo;
	}
	public void setAppidTwo(String appidTwo) {
		this.appidTwo = appidTwo;
	}

	public String getExtraJson() {
		return this.extraJson;
	}
	public void setExtraJson(String extraJson) {
		this.extraJson = extraJson;
	}

	public String getExtraJson1() {
		return this.extraJson1;
	}
	public void setExtraJson1(String extraJson1) {
		this.extraJson1 = extraJson1;
	}

	public String getLalalaOpenid() {
		return this.lalalaOpenid;
	}
	public void setLalalaOpenid(String lalalaOpenid) {
		this.lalalaOpenid = lalalaOpenid;
	}

	public String getLalalaRealOpenId() {
		return this.lalalaRealOpenId;
	}
	public void setLalalaRealOpenId(String lalalaRealOpenId) {
		this.lalalaRealOpenId = lalalaRealOpenId;
	}

	public String getLalalala() {
		return this.lalalala;
	}
	public void setLalalala(String lalalala) {
		this.lalalala = lalalala;
	}

	public String getOneOpenId() {
		return this.oneOpenId;
	}
	public void setOneOpenId(String oneOpenId) {
		this.oneOpenId = oneOpenId;
	}

	public String getOneUid() {
		return this.oneUid;
	}
	public void setOneUid(String oneUid) {
		this.oneUid = oneUid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getResultOneuidOriginal() {
		return this.resultOneuidOriginal;
	}
	public void setResultOneuidOriginal(String resultOneuidOriginal) {
		this.resultOneuidOriginal = resultOneuidOriginal;
	}

	public OpenidComplex getTest() {
		return this.test;
	}
	public void setTest(OpenidComplex test) {
		this.test = test;
	}

	public String getTestJson() {
		return this.testJson;
	}
	public void setTestJson(String testJson) {
		this.testJson = testJson;
	}

	public String getTestWrong() {
		return this.testWrong;
	}
	public void setTestWrong(String testWrong) {
		this.testWrong = testWrong;
	}

	public String getThreeOpenId() {
		return this.threeOpenId;
	}
	public void setThreeOpenId(String threeOpenId) {
		this.threeOpenId = threeOpenId;
	}

	public String getThreeUid() {
		return this.threeUid;
	}
	public void setThreeUid(String threeUid) {
		this.threeUid = threeUid;
	}

	public String getTwoOpenId() {
		return this.twoOpenId;
	}
	public void setTwoOpenId(String twoOpenId) {
		this.twoOpenId = twoOpenId;
	}

	public String getTwoUid() {
		return this.twoUid;
	}
	public void setTwoUid(String twoUid) {
		this.twoUid = twoUid;
	}

	public List<String> getUidList() {
		return this.uidList;
	}
	public void setUidList(List<String> uidList) {
		this.uidList = uidList;
	}

	public List<String> getUidListOpenIdList() {
		return this.uidListOpenIdList;
	}
	public void setUidListOpenIdList(List<String> uidListOpenIdList) {
		this.uidListOpenIdList = uidListOpenIdList;
	}

	public UserDetail getUserDetail() {
		return this.userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
