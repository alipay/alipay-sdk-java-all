package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费外籍留学生缴费学校信息录入接口
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:03:33
 */
public class AlipayOverseasFundInstitutionschoolinfCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1491899995767475393L;

	/**
	 * 必填，必须是行业属性代码表中存在的最细分类的记录。
	 */
	@ApiField("attr_code")
	private String attrCode;

	/**
	 * 必填，必须是行政区划表中存在的记录，但不能选100000。
	 */
	@ApiField("bussess_adr")
	private String bussessAdr;

	/**
	 * 城市的国家编码（国家统计局出版的行政区划代码 http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/）
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 必填，字母代码，必须是国别/地区代码表中存在的记录。如果100、200、300项下的任何一项，则常驻国家地区应为中国CHN。如果经济类型选择400，则常驻国家地区为外国、中国港澳台地区或国际组（IOS）。
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 交易主体---02-金融机构
03-中资机构
04-外资机构
	 */
	@ApiField("cust_type")
	private String custType;

	/**
	 * 申报方式--因银行只能通过银行版为企业开通网上申报并打印初始密码等信息，故银行版接口导入程序仅对此项进行格式检查，不改变银行版中单位基本情况表的申报方式。
	 */
	@ApiField("declare_type")
	private String declareType;

	/**
	 * 区县的国家编码（国家统计局出版的行政区划代码 http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/）
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 经济类型代码,必须是经济类型代码表中存在的最细分类的记录
	 */
	@ApiField("economy_type_code")
	private String economyTypeCode;

	/**
	 * 扩展字段格式为：json
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 字母代码，必须是国别/地区代码表中存在的记录；

外方投资者国别不能选择中国。

如果经济类型为200项下，则外方投资者国别中至少有港澳台之一，不能为空；

如果经济类型选择300项下，则外方投资者国别中不能为空，至少一项为外国（中国大陆及港澳台除外）；

如果经济类型选择400，外方投资者国别必须为空。
	 */
	@ApiField("investment_country_code_one")
	private String investmentCountryCodeOne;

	/**
	 * 是否特殊经济区内企业,N-非特殊经济区内企业
Y-特殊经济区内企业
	 */
	@ApiField("is_special_economic_zone")
	private String isSpecialEconomicZone;

	/**
	 * ISV公司名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * ISV的联系方式
	 */
	@ApiField("isv_phone")
	private String isvPhone;

	/**
	 * isv请求号
	 */
	@ApiField("isv_request_no")
	private String isvRequestNo;

	/**
	 * 学校联系人姓名
	 */
	@ApiField("link_man_name")
	private String linkManName;

	/**
	 * 学校联系电话
	 */
	@ApiField("link_phone")
	private String linkPhone;

	/**
	 * 组织机构英文名称和单位地址（英文）两个字段的长度加总不能超过130个字符
	 */
	@ApiField("office_adr_en")
	private String officeAdrEn;

	/**
	 * 英文名称可填特殊机构代码赋码通知书上载明名称，不应包含全角字符。
	 */
	@ApiField("org_name_en")
	private String orgNameEn;

	/**
	 * 机关/事业单位/企业/社会团体/军队武警、境外机构、驻华使领馆等特殊机构/其他组织机构，见机构类型代码表
本列填写CODE码
	 */
	@ApiField("org_type")
	private String orgType;

	/**
	 * 省份的国家编码（国家统计局出版的行政区划代码 http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/）
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 开户描述信息
	 */
	@ApiField("remark_info")
	private String remarkInfo;

	/**
	 * 学校详细地址
	 */
	@ApiField("school_address")
	private String schoolAddress;

	/**
	 * 学校所在的国家编码ISO2位标准
	 */
	@ApiField("school_country")
	private String schoolCountry;

	/**
	 * 学校英文名称
	 */
	@ApiField("school_en_name")
	private String schoolEnName;

	/**
	 * 学校的校徽或logo，在学校展示页面作为学校的标识。该字段为图片的链接地址，只支持png或jpg图片格式，图片高度为108，宽度为108 ，不大于20k。 注意：此链接要求公网可以访问，否则无法正常展示。
	 */
	@ApiField("school_icon")
	private String schoolIcon;

	/**
	 * 如果填写了school_icon参数，则此字段不能为空。目前只支持png和jpg两种格式
	 */
	@ApiField("school_icon_type")
	private String schoolIconType;

	/**
	 * 行业类别标识符
	 */
	@ApiField("school_mcc")
	private String schoolMcc;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 学校签约支付宝教育缴费支付宝pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	/**
	 * 学校(机构)标识码（由教育部按照国家标准及编码规则编制，可以在教育局官网查询）
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/**
	 * 学校的类型： 1：代表托儿所； 2：代表幼儿园；3：代表小学；4：代表初中；5：代表高中；6:大学;9：国际。10：涉外培训机构。 如果学校兼有多种属性，可以连写，比如： 45：代表兼有初中部高中部；34：代表兼有小学部初中部；
	 */
	@ApiField("school_type")
	private String schoolType;

	/**
	 * 邮政编码
	 */
	@ApiField("school_zipcode")
	private String schoolZipcode;

	/**
	 * 如果“是否特殊经济区内企业”选择“否”，则本项选择“一般贸易区”或“自由贸易试验区（非特殊监管）”；

如果“是否特殊经济区内企业”选择“是”，且企业为非自由贸易试验区的特殊经济区内企业，本项选择“保税区”、“出口加工区”、“保税物流中心B型”、“保税物流园区”、“钻石交易所”、“保税港区”、“综合保税区”、“跨境工业园区”、“保税物流中心A型”、“出口监管仓库”、“进口保税仓库”、或“其他”；

如果“是否特殊经济区内企业”选择“是”，且企业为自由贸易试验区的特殊经济区内企业，本项选择“自由贸易试验区（特殊监管）”。

注：是否企业为自由贸易试验区的特殊经济区内企业，人工判断
	 */
	@ApiField("special_economic_zone_company_type")
	private String specialEconomicZoneCompanyType;

	/**
	 * 交易用eMail
	 */
	@ApiField("trans_email")
	private String transEmail;

	public String getAttrCode() {
		return this.attrCode;
	}
	public void setAttrCode(String attrCode) {
		this.attrCode = attrCode;
	}

	public String getBussessAdr() {
		return this.bussessAdr;
	}
	public void setBussessAdr(String bussessAdr) {
		this.bussessAdr = bussessAdr;
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

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCustType() {
		return this.custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getDeclareType() {
		return this.declareType;
	}
	public void setDeclareType(String declareType) {
		this.declareType = declareType;
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

	public String getEconomyTypeCode() {
		return this.economyTypeCode;
	}
	public void setEconomyTypeCode(String economyTypeCode) {
		this.economyTypeCode = economyTypeCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getInvestmentCountryCodeOne() {
		return this.investmentCountryCodeOne;
	}
	public void setInvestmentCountryCodeOne(String investmentCountryCodeOne) {
		this.investmentCountryCodeOne = investmentCountryCodeOne;
	}

	public String getIsSpecialEconomicZone() {
		return this.isSpecialEconomicZone;
	}
	public void setIsSpecialEconomicZone(String isSpecialEconomicZone) {
		this.isSpecialEconomicZone = isSpecialEconomicZone;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvPhone() {
		return this.isvPhone;
	}
	public void setIsvPhone(String isvPhone) {
		this.isvPhone = isvPhone;
	}

	public String getIsvRequestNo() {
		return this.isvRequestNo;
	}
	public void setIsvRequestNo(String isvRequestNo) {
		this.isvRequestNo = isvRequestNo;
	}

	public String getLinkManName() {
		return this.linkManName;
	}
	public void setLinkManName(String linkManName) {
		this.linkManName = linkManName;
	}

	public String getLinkPhone() {
		return this.linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public String getOfficeAdrEn() {
		return this.officeAdrEn;
	}
	public void setOfficeAdrEn(String officeAdrEn) {
		this.officeAdrEn = officeAdrEn;
	}

	public String getOrgNameEn() {
		return this.orgNameEn;
	}
	public void setOrgNameEn(String orgNameEn) {
		this.orgNameEn = orgNameEn;
	}

	public String getOrgType() {
		return this.orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
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

	public String getRemarkInfo() {
		return this.remarkInfo;
	}
	public void setRemarkInfo(String remarkInfo) {
		this.remarkInfo = remarkInfo;
	}

	public String getSchoolAddress() {
		return this.schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolCountry() {
		return this.schoolCountry;
	}
	public void setSchoolCountry(String schoolCountry) {
		this.schoolCountry = schoolCountry;
	}

	public String getSchoolEnName() {
		return this.schoolEnName;
	}
	public void setSchoolEnName(String schoolEnName) {
		this.schoolEnName = schoolEnName;
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

	public String getSchoolMcc() {
		return this.schoolMcc;
	}
	public void setSchoolMcc(String schoolMcc) {
		this.schoolMcc = schoolMcc;
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

	public String getSchoolZipcode() {
		return this.schoolZipcode;
	}
	public void setSchoolZipcode(String schoolZipcode) {
		this.schoolZipcode = schoolZipcode;
	}

	public String getSpecialEconomicZoneCompanyType() {
		return this.specialEconomicZoneCompanyType;
	}
	public void setSpecialEconomicZoneCompanyType(String specialEconomicZoneCompanyType) {
		this.specialEconomicZoneCompanyType = specialEconomicZoneCompanyType;
	}

	public String getTransEmail() {
		return this.transEmail;
	}
	public void setTransEmail(String transEmail) {
		this.transEmail = transEmail;
	}

}
