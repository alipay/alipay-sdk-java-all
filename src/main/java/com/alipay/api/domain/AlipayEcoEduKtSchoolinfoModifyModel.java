package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费学校信息录入接口
 *
 * @author auto create
 * @since 1.0, 2020-12-22 16:13:22
 */
public class AlipayEcoEduKtSchoolinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5124897525517764479L;

	/**
	 * 与浙江网商交易见证平台有交互ISV输入网商交易异步通知回调URL，教育缴费同步账单信息给网商，网商会回调此url，ISV即可获取网商相关的参数，根据教育缴费平台账单发送接口返回的 order_no和网商返回的outer_trade_no来对应账单信息。
	 */
	@ApiField("bank_notify_url")
	private String bankNotifyUrl;

	/**
	 * 与浙江网商交易见证平台有交互的ISV,由交易见证平台分配给合作方业务平台 签约唯一ID ，由网商分配给ISV的渠道参数
	 */
	@ApiField("bank_partner_id")
	private String bankPartnerId;

	/**
	 * 与浙江网商交易见证平台有交互的ISV在创建账户时的uid，也就是ISV平台上的用户ID（字母或数字）
	 */
	@ApiField("bank_uid")
	private String bankUid;

	/**
	 * 对应集团到卡模式的银行编号.学校与支付宝后台签约时，由学校提交给支付宝的编号
	 */
	@ApiField("bankcard_no")
	private String bankcardNo;

	/**
	 * 集团收单模式：分账批次号，支付宝配置后提供的银行卡批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 学校开通直付通卡编号，smid与card_alias_no必须同时填写
	 */
	@ApiField("card_alias_no")
	private String cardAliasNo;

	/**
	 * 城市的国家编码。参见 <a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">国家统计局出版的行政区划代码</a>。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 集团收单模式：BD批量上传银行卡信息后，支付宝系统分配给ISV的每个卡分配的唯一标识
	 */
	@ApiField("corporate_branch_pid")
	private String corporateBranchPid;

	/**
	 * 区县的国家编码。参见 <a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">国家统计局出版的行政区划代码</a>。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * ISV公司名称 ， 会在账单详情页面展示给用户
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 注意：本参数于2017-08-03开始已经废弃，不再需要传递。
由支付宝提供的给已经签约的isv的编码，业务上一般直接采用isv的支付宝PID。
	 */
	@ApiField("isv_no")
	private String isvNo;

	/**
	 * 此通知地址是为了保持教育缴费平台与ISV商户支付状态一致性。用户支付成功后，支付宝会根据本isv_notify_url(异步通知说明https://docs.open.alipay.com/203/105286/)，通过POST请求的形式将支付结果作为参数通知到商户系统，ISV商户可以根据返回的参数更新账单状态。
	 */
	@ApiField("isv_notify_url")
	private String isvNotifyUrl;

	/**
	 * ISV的联系方式 ， 会在账单详情页面展示给用户，用户有问题可以直接联系此电话获取帮助
	 */
	@ApiField("isv_phone")
	private String isvPhone;

	/**
	 * 填写已经签约教育缴费的isv的支付宝PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 省份的国家编码，参见 <a href="http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/">国家统计局出版的行政区划代码</a>。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 学校的校徽或logo，在学校展示页面作为学校的标识。该字段为图片的链接地址，只支持png或jpg图片格式，图片高度为108，宽度为108 ，不大于20k。
注意：此链接要求公网可以访问，否则无法正常展示。
	 */
	@ApiField("school_icon")
	private String schoolIcon;

	/**
	 * 如果填写了school_icon参数，则此字段不能为空。目前只支持png和jpg两种格式
	 */
	@ApiField("school_icon_type")
	private String schoolIconType;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校签约支付宝教育缴费支付宝pid,如果是直付通学校，填写直付通返回的smid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学校(机构)标识码（由教育部按照国家标准及编码规则编制，可以在教育局官网查询）
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 学校的类型。枚举值如下：
*1：代表托儿所。
*2：代表幼儿园。
*3：代表小学。
*4：代表初中。
*5：代表高中。
注意：如果学校兼有多种属性，可以连写，比如：45：代表兼有初中部高中部；34：代表兼有小学部初中部。
	 */
	@ApiField("school_type")
	private String schoolType;

	/**
	 * 学校开通直付通返回的二级商户id，smid与card_alias_no必须同时填写
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 集团收单模式：分账批次号，支付宝配置后提供的银行卡批次号
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 与浙江网商交易见证平台有交互的ISV,由网商分配给ISV的渠道参数
	 */
	@ApiField("white_channel_code")
	private String whiteChannelCode;

	public String getBankNotifyUrl() {
		return this.bankNotifyUrl;
	}
	public void setBankNotifyUrl(String bankNotifyUrl) {
		this.bankNotifyUrl = bankNotifyUrl;
	}

	public String getBankPartnerId() {
		return this.bankPartnerId;
	}
	public void setBankPartnerId(String bankPartnerId) {
		this.bankPartnerId = bankPartnerId;
	}

	public String getBankUid() {
		return this.bankUid;
	}
	public void setBankUid(String bankUid) {
		this.bankUid = bankUid;
	}

	public String getBankcardNo() {
		return this.bankcardNo;
	}
	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getCardAliasNo() {
		return this.cardAliasNo;
	}
	public void setCardAliasNo(String cardAliasNo) {
		this.cardAliasNo = cardAliasNo;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCorporateBranchPid() {
		return this.corporateBranchPid;
	}
	public void setCorporateBranchPid(String corporateBranchPid) {
		this.corporateBranchPid = corporateBranchPid;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvNo() {
		return this.isvNo;
	}
	public void setIsvNo(String isvNo) {
		this.isvNo = isvNo;
	}

	public String getIsvNotifyUrl() {
		return this.isvNotifyUrl;
	}
	public void setIsvNotifyUrl(String isvNotifyUrl) {
		this.isvNotifyUrl = isvNotifyUrl;
	}

	public String getIsvPhone() {
		return this.isvPhone;
	}
	public void setIsvPhone(String isvPhone) {
		this.isvPhone = isvPhone;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getSchoolIcon() {
		return this.schoolIcon;
	}
	public void setSchoolIcon(String schoolIcon) {
		this.schoolIcon = schoolIcon;
	}

	public String getSchoolIconType() {
		return this.schoolIconType;
	}
	public void setSchoolIconType(String schoolIconType) {
		this.schoolIconType = schoolIconType;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

	public String getSchoolStdcode() {
		return this.schoolStdcode;
	}
	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}

	public String getSchoolType() {
		return this.schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getWhiteChannelCode() {
		return this.whiteChannelCode;
	}
	public void setWhiteChannelCode(String whiteChannelCode) {
		this.whiteChannelCode = whiteChannelCode;
	}

}
