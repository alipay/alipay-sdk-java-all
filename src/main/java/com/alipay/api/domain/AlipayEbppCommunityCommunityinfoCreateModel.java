package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小区创建
 *
 * @author auto create
 * @since 1.0, 2021-03-03 16:16:54
 */
public class AlipayEbppCommunityCommunityinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6225424241648659223L;

	/**
	 * 别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 地市行政区化代码
	 */
	@ApiField("city")
	private String city;

	/**
	 * 小区编码，兼容迁移小区时所需；正常的非迁移的小区创建时不需要传
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 区县行政区化代码
	 */
	@ApiField("county")
	private String county;

	/**
	 * 小区热线
	 */
	@ApiField("hot_line")
	private String hotLine;

	/**
	 * 服务时间结束
	 */
	@ApiField("hot_line_end")
	private String hotLineEnd;

	/**
	 * 服务时间开始
	 */
	@ApiField("hot_line_start")
	private String hotLineStart;

	/**
	 * 小区名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 地理信息
	 */
	@ApiListField("pois")
	@ApiField("external_poi_info")
	private List<ExternalPoiInfo> pois;

	/**
	 * 省行政区化代码
	 */
	@ApiField("province")
	private String province;

	/**
	 * 中心账单楼房号模式	REMOTE
中心账单户号模式	REMOTE_NO_ROOM
内部H5模式	H5
内部底座模式	SAAS
自运营账单-楼房号 EXTERNAL_BILL_ROOM
自运营账单-仅户号 EXTERNAL_BILL_BILLKEY
备注：1、中心账单楼房号模式会进行用户隐私校验
	   2、不确定使用哪种方式时请联系对应BD或开发
	 */
	@ApiField("support_type")
	private String supportType;

	/**
	 * 业主姓名验证        NAME_VERIFY
业主手机验证        MOBILE_VERIFY
房间户号验证        ROOM_VERIFY(不传 则默认)
业主姓名+手机      NAME_MOBILE_VERIFY
	 */
	@ApiField("verify_type")
	private String verifyType;

	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getHotLine() {
		return this.hotLine;
	}
	public void setHotLine(String hotLine) {
		this.hotLine = hotLine;
	}

	public String getHotLineEnd() {
		return this.hotLineEnd;
	}
	public void setHotLineEnd(String hotLineEnd) {
		this.hotLineEnd = hotLineEnd;
	}

	public String getHotLineStart() {
		return this.hotLineStart;
	}
	public void setHotLineStart(String hotLineStart) {
		this.hotLineStart = hotLineStart;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<ExternalPoiInfo> getPois() {
		return this.pois;
	}
	public void setPois(List<ExternalPoiInfo> pois) {
		this.pois = pois;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSupportType() {
		return this.supportType;
	}
	public void setSupportType(String supportType) {
		this.supportType = supportType;
	}

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
