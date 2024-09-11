package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步候选人体检状态的接口
 *
 * @author auto create
 * @since 1.0, 2024-07-25 14:57:16
 */
public class AlipayDigitalmgmtHrhealthEntryUserSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6284495284288962653L;

	/**
	 * 该参数为候选人在供应商系统预约时选择的机构名称，由候选人选择体检机构后确定传入，字符串，蚂蚁系统接收后存入数据库用于后续业务操作，候选人预约成功时传入
	 */
	@ApiField("agency_name")
	private String agencyName;

	/**
	 * 证件名字，该参数为候选人在供应商机构体检时出示的有效证件，由候选人去现场体检后传回，字符串，蚂蚁系统接收之后用于校验是否为本人参加体检，候选人到检后传入
	 */
	@ApiField("cert_genre")
	private String certGenre;

	/**
	 * 该参数为候选人在供应商机构体检时录入的证件号+MD5生成，由候选人体检时传入，字符串，蚂蚁系统接收之后用于比对系统当前的候选人证件号是否匹配，候选人已到检后传入
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 该参数代表候选人预约了哪个城市的体检，候选人在供应商系统操作时选择，字符串，蚂蚁系统接收之后存入数据库供后续业务流程操作，候选人预约成功时必传
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * data_key用于校验供应商的权限，每一个接入系统的供应商只有一个该参数，供应商来对接时蚂蚁生成唯一参数线下给到供应商侧
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * form_no，唯一，用于确定唯一的候选人，是通过蚂蚁入职体检系统的数据库id加盐生成，字符串类型，用来确定唯一的候选人使用，不会为空
	 */
	@ApiField("form_no")
	private String formNo;

	/**
	 * 该参数为候选人在供应商系统选择的体检套餐名，由候选人选择套餐后确定传入，字符串，蚂蚁系统获取后存入数据供后续业务操作，候选人预约成功时传入
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 该参数为候选人在供应商系统体检完成，生成的体检报告下载链接，供应商系统生成体检报告后传入，字符串，蚂蚁系统接收之后通过链接下载到本地数据库用于后续业务处理，供应商生成报告时必传
	 */
	@ApiField("report_link")
	private String reportLink;

	/**
	 * 该参数用于确认候选人的预约体检的状态，根据双方约定好的状态码传入，字符串，蚂蚁系统使用该参数确定候选人预约状态并作下一步动作，必传，无默认值
	 */
	@ApiField("reservation_status")
	private String reservationStatus;

	/**
	 * 该参数为候选人在供应商系统预约体检时选择的体检时间，由候选人选择体检时间后传入，字符串，蚂蚁系统接收之后存入数据库用于后续业务动作，候选人预约成功后传入
	 */
	@ApiField("reservation_time")
	private String reservationTime;

	public String getAgencyName() {
		return this.agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getCertGenre() {
		return this.certGenre;
	}
	public void setCertGenre(String certGenre) {
		this.certGenre = certGenre;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public String getFormNo() {
		return this.formNo;
	}
	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getReportLink() {
		return this.reportLink;
	}
	public void setReportLink(String reportLink) {
		this.reportLink = reportLink;
	}

	public String getReservationStatus() {
		return this.reservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public String getReservationTime() {
		return this.reservationTime;
	}
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}

}
