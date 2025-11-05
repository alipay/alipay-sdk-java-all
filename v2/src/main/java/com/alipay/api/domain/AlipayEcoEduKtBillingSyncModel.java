package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 教育缴费定向同步接口
 *
 * @author auto create
 * @since 1.0, 2025-03-20 19:30:25
 */
public class AlipayEcoEduKtBillingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8478473194696263339L;

	/**
	 * 如果所在学校分校区，传入分校区编号，不传默认为总校或无分校区
	 */
	@ApiField("campus_id")
	private String campusId;

	/**
	 * 如果所在学校分校区，传入分校区名称，不传默认为总校或无分校区
	 */
	@ApiField("campus_name")
	private String campusName;

	/**
	 * 缴费项目明细
	 */
	@ApiListField("charge_items")
	@ApiField("edu_pay_items")
	private List<EduPayItems> chargeItems;

	/**
	 * 学校所在市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 当前就读班级
	 */
	@ApiField("current_class")
	private String currentClass;

	/**
	 * 当前就读年级，取值：
小一～小五、中预、中一～中三、高一～高三、大一～大三
	 */
	@ApiField("current_grade")
	private String currentGrade;

	/**
	 * 学校所在区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 学校所在区国标码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 业务拓展字段，以json格式传递
	 */
	@ApiField("ext_info")
	private BillSyncExtInfo extInfo;

	/**
	 * 账单生成时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 账单更新时间
	 */
	@ApiField("gmt_modify")
	private Date gmtModify;

	/**
	 * 交易支付时间，取支付宝支付接口返回的gmt_payment值
	 */
	@ApiField("gmt_paytime")
	private Date gmtPaytime;

	/**
	 * isv的账单号，针对教育缴费平台的外部唯一单号
	 */
	@ApiField("isv_order_no")
	private String isvOrderNo;

	/**
	 * 账单总金额。单位：元，保留两位小数
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 账单状态。0.未支付, 1:支付中, 2:支付成功, 3:支付失败, 4:退款已关闭,5:缴费成功,6:逾期关闭,8:ISV账单关闭
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 交易金额，取支付宝支付接口返回的gmt_payment值。单位：元，保留两位小数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 实际完成缴费支付的用户支付宝uid，缴费记录挂账在该支付宝账户下
	 */
	@ApiField("pay_user_id")
	private String payUserId;

	/**
	 * 支付宝用户编号的加密信息
	 */
	@ApiField("pay_user_open_id")
	private String payUserOpenId;

	/**
	 * 学校所在省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 学校编号  SV发送模式下必传
	 */
	@ApiField("school_code")
	private String schoolCode;

	/**
	 * 学校编号，需保证唯一，公立学校建议用办学许可证号，私立学校用组织机构代码证。
对应直付通进件接口中external_id。
	 */
	@ApiField("school_external_id")
	private String schoolExternalId;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校签约的支付宝主账户PID或直付通进件后的二级商户smid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学校性质：1-公立学校；2-民办学校；3-教培机构
	 */
	@ApiField("school_property")
	private String schoolProperty;

	/**
	 * 学校类型。1-学前教育；2-中小学教育；3-高等教育；4-培训机构。
	 */
	@ApiField("school_type")
	private String schoolType;

	/**
	 * 教育缴费平台的账单来源。7-ISV发送；2-钉钉同步
	 */
	@ApiField("source")
	private String source;

	/**
	 * 学生编号。只支持字母和数字类型，一般以教育局学号为准，作为学生的唯一标识。钉钉必传，isv来源学生编号和家长手机号必传一个
	 */
	@ApiField("student_code")
	private String studentCode;

	/**
	 * 学生姓名
	 */
	@ApiField("student_name")
	private String studentName;

	/**
	 * 子机构名称
	 */
	@ApiField("sub_orgname")
	private String subOrgname;

	/**
	 * 子机构类型
枚举值如下：
0:幼儿园
1:小学
2:初中
3:高中
4:大学
5:中职中专
6:培训机构
7:高职高专
8:成人教育、函授等
10.政务机关
	 */
	@ApiField("sub_orgtype")
	private String subOrgtype;

	/**
	 * 返佣标识码。根据具体场景传递对应值。智能账单场景：edu_trade_sync
	 */
	@ApiField("sys_service_param")
	private String sysServiceParam;

	/**
	 * 返佣字段
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	/**
	 * 缴费账单名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 渠道侧发起支付宝交易的支付宝交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 标价币种, total_amount对应的币种单位，非CNY人民币种需传入。
目前支持英镑：GBP、港币：HKD、美元：USD、新加坡元：SGD、日元：JPY、加拿大元：CAD、澳元：AUD、欧元：EUR、新西兰元：NZD、韩元：KRW、泰铢：THB、瑞士法郎：CHF、瑞典克朗：SEK、丹麦克朗：DKK、挪威克朗：NOK、马来西亚林吉特：MYR、印尼卢比：IDR、菲律宾比索：PHP、毛里求斯卢比：MUR、以色列新谢克尔：ILS、斯里兰卡卢比：LKR、俄罗斯卢布：RUB、阿联酋迪拉姆：AED、捷克克朗：CZK、南非兰特：ZAR、人民币：CNY
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	/**
	 * 为学生缴费的家长信息
钉钉必传，isv来源学生编号和家长手机号必传一个
	 */
	@ApiField("user")
	private UserDetails user;

	public String getCampusId() {
		return this.campusId;
	}
	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	public String getCampusName() {
		return this.campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	public List<EduPayItems> getChargeItems() {
		return this.chargeItems;
	}
	public void setChargeItems(List<EduPayItems> chargeItems) {
		this.chargeItems = chargeItems;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCurrentClass() {
		return this.currentClass;
	}
	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}

	public String getCurrentGrade() {
		return this.currentGrade;
	}
	public void setCurrentGrade(String currentGrade) {
		this.currentGrade = currentGrade;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public BillSyncExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(BillSyncExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModify() {
		return this.gmtModify;
	}
	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}

	public Date getGmtPaytime() {
		return this.gmtPaytime;
	}
	public void setGmtPaytime(Date gmtPaytime) {
		this.gmtPaytime = gmtPaytime;
	}

	public String getIsvOrderNo() {
		return this.isvOrderNo;
	}
	public void setIsvOrderNo(String isvOrderNo) {
		this.isvOrderNo = isvOrderNo;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayUserId() {
		return this.payUserId;
	}
	public void setPayUserId(String payUserId) {
		this.payUserId = payUserId;
	}

	public String getPayUserOpenId() {
		return this.payUserOpenId;
	}
	public void setPayUserOpenId(String payUserOpenId) {
		this.payUserOpenId = payUserOpenId;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSchoolCode() {
		return this.schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolExternalId() {
		return this.schoolExternalId;
	}
	public void setSchoolExternalId(String schoolExternalId) {
		this.schoolExternalId = schoolExternalId;
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

	public String getSchoolProperty() {
		return this.schoolProperty;
	}
	public void setSchoolProperty(String schoolProperty) {
		this.schoolProperty = schoolProperty;
	}

	public String getSchoolType() {
		return this.schoolType;
	}
	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStudentCode() {
		return this.studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubOrgname() {
		return this.subOrgname;
	}
	public void setSubOrgname(String subOrgname) {
		this.subOrgname = subOrgname;
	}

	public String getSubOrgtype() {
		return this.subOrgtype;
	}
	public void setSubOrgtype(String subOrgtype) {
		this.subOrgtype = subOrgtype;
	}

	public String getSysServiceParam() {
		return this.sysServiceParam;
	}
	public void setSysServiceParam(String sysServiceParam) {
		this.sysServiceParam = sysServiceParam;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

	public UserDetails getUser() {
		return this.user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}

}
