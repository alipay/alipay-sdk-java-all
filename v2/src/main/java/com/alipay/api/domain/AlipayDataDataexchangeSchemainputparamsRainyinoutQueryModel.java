package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Schema模型入参测试接口01
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:15:01
 */
public class AlipayDataDataexchangeSchemainputparamsRainyinoutQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3846515966916783759L;

	/**
	 * 中文描述
	 */
	@ApiField("account")
	private String account;

	/**
	 * 判断是否是UID或者OPENID
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 字段映射
	 */
	@ApiField("accout_ref_id_type_openid")
	private String accoutRefIdTypeOpenid;

	/**
	 * true
	 */
	@ApiField("boolean_01_n_select_one")
	private Boolean boolean01NSelectOne;

	/**
	 * null
	 */
	@ApiListField("boolean_02_n_select_one")
	@ApiField("boolean")
	private List<Boolean> boolean02NSelectOne;

	/**
	 * date
	 */
	@ApiField("date_01_n_select_one")
	private Date date01NSelectOne;

	/**
	 * null
	 */
	@ApiListField("date_02_n_select_one")
	@ApiField("date")
	private List<Date> date02NSelectOne;

	/**
	 * number
	 */
	@ApiField("num_01_n_select_one")
	private Long num01NSelectOne;

	/**
	 * null
	 */
	@ApiListField("num_02_n_select_one")
	@ApiField("number")
	private List<Long> num02NSelectOne;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * price
	 */
	@ApiField("price_01_n_select_one")
	private String price01NSelectOne;

	/**
	 * null
	 */
	@ApiListField("price_02_n_select_one")
	@ApiField("price")
	private List<String> price02NSelectOne;

	/**
	 * 2
	 */
	@ApiField("string_01_n_select_one")
	private String string01NSelectOne;

	/**
	 * null
	 */
	@ApiListField("string_02_n_select_one")
	@ApiField("string")
	private List<String> string02NSelectOne;

	/**
	 * 废弃 当前字段已废弃(Rainy新模型测试)
	 */
	@ApiField("tc_case")
	@Deprecated
	private String tcCase;

	/**
	 * mix uid type
	 */
	@ApiField("tc_mix_uid")
	private String tcMixUid;

	/**
	 * mix uid type
	 */
	@ApiField("tc_mix_uid_ref_openid")
	private String tcMixUidRefOpenid;

	/**
	 * not uid
	 */
	@ApiField("tc_not_uid")
	private String tcNotUid;

	/**
	 * openId json type
	 */
	@ApiField("tc_openid_json")
	private String tcOpenidJson;

	/**
	 * desc中文描述拉
	 */
	@ApiField("tc_pid")
	private String tcPid;

	/**
	 * smid中文描述拉
	 */
	@ApiField("tc_smid")
	private String tcSmid;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id_ref_openid")
	private String userIdRefOpenid;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccoutRefIdTypeOpenid() {
		return this.accoutRefIdTypeOpenid;
	}
	public void setAccoutRefIdTypeOpenid(String accoutRefIdTypeOpenid) {
		this.accoutRefIdTypeOpenid = accoutRefIdTypeOpenid;
	}

	public Boolean getBoolean01NSelectOne() {
		return this.boolean01NSelectOne;
	}
	public void setBoolean01NSelectOne(Boolean boolean01NSelectOne) {
		this.boolean01NSelectOne = boolean01NSelectOne;
	}

	public List<Boolean> getBoolean02NSelectOne() {
		return this.boolean02NSelectOne;
	}
	public void setBoolean02NSelectOne(List<Boolean> boolean02NSelectOne) {
		this.boolean02NSelectOne = boolean02NSelectOne;
	}

	public Date getDate01NSelectOne() {
		return this.date01NSelectOne;
	}
	public void setDate01NSelectOne(Date date01NSelectOne) {
		this.date01NSelectOne = date01NSelectOne;
	}

	public List<Date> getDate02NSelectOne() {
		return this.date02NSelectOne;
	}
	public void setDate02NSelectOne(List<Date> date02NSelectOne) {
		this.date02NSelectOne = date02NSelectOne;
	}

	public Long getNum01NSelectOne() {
		return this.num01NSelectOne;
	}
	public void setNum01NSelectOne(Long num01NSelectOne) {
		this.num01NSelectOne = num01NSelectOne;
	}

	public List<Long> getNum02NSelectOne() {
		return this.num02NSelectOne;
	}
	public void setNum02NSelectOne(List<Long> num02NSelectOne) {
		this.num02NSelectOne = num02NSelectOne;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrice01NSelectOne() {
		return this.price01NSelectOne;
	}
	public void setPrice01NSelectOne(String price01NSelectOne) {
		this.price01NSelectOne = price01NSelectOne;
	}

	public List<String> getPrice02NSelectOne() {
		return this.price02NSelectOne;
	}
	public void setPrice02NSelectOne(List<String> price02NSelectOne) {
		this.price02NSelectOne = price02NSelectOne;
	}

	public String getString01NSelectOne() {
		return this.string01NSelectOne;
	}
	public void setString01NSelectOne(String string01NSelectOne) {
		this.string01NSelectOne = string01NSelectOne;
	}

	public List<String> getString02NSelectOne() {
		return this.string02NSelectOne;
	}
	public void setString02NSelectOne(List<String> string02NSelectOne) {
		this.string02NSelectOne = string02NSelectOne;
	}

	public String getTcCase() {
		return this.tcCase;
	}
	public void setTcCase(String tcCase) {
		this.tcCase = tcCase;
	}

	public String getTcMixUid() {
		return this.tcMixUid;
	}
	public void setTcMixUid(String tcMixUid) {
		this.tcMixUid = tcMixUid;
	}

	public String getTcMixUidRefOpenid() {
		return this.tcMixUidRefOpenid;
	}
	public void setTcMixUidRefOpenid(String tcMixUidRefOpenid) {
		this.tcMixUidRefOpenid = tcMixUidRefOpenid;
	}

	public String getTcNotUid() {
		return this.tcNotUid;
	}
	public void setTcNotUid(String tcNotUid) {
		this.tcNotUid = tcNotUid;
	}

	public String getTcOpenidJson() {
		return this.tcOpenidJson;
	}
	public void setTcOpenidJson(String tcOpenidJson) {
		this.tcOpenidJson = tcOpenidJson;
	}

	public String getTcPid() {
		return this.tcPid;
	}
	public void setTcPid(String tcPid) {
		this.tcPid = tcPid;
	}

	public String getTcSmid() {
		return this.tcSmid;
	}
	public void setTcSmid(String tcSmid) {
		this.tcSmid = tcSmid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdRefOpenid() {
		return this.userIdRefOpenid;
	}
	public void setUserIdRefOpenid(String userIdRefOpenid) {
		this.userIdRefOpenid = userIdRefOpenid;
	}

}
