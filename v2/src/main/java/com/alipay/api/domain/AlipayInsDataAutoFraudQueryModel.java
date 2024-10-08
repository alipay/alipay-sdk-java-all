package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔反欺诈查询服务
 *
 * @author auto create
 * @since 1.0, 2018-05-25 11:02:22
 */
public class AlipayInsDataAutoFraudQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4283691613928523886L;

	/**
	 * 出险城市，六位国标码
	 */
	@ApiField("accident_city")
	private String accidentCity;

	/**
	 * 出险时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("accident_date")
	private Date accidentDate;

	/**
	 * 出险地点
	 */
	@ApiField("accident_location")
	private String accidentLocation;

	/**
	 * 立案金额，单位：元
查勘阶段必传
	 */
	@ApiField("case_amount")
	private String caseAmount;

	/**
	 * 估损金额，单位：元
核赔阶段必传
	 */
	@ApiField("estimate_damage_amount")
	private String estimateDamageAmount;

	/**
	 * 报案人信息
	 */
	@ApiField("informant")
	private Informant informant;

	/**
	 * 人伤数量，上限15，没有人伤则填0
	 */
	@ApiField("injured_count")
	private Long injuredCount;

	/**
	 * 伤者列表，涉及人伤案件在查勘、核赔阶段必选
	 */
	@ApiListField("injured_list")
	@ApiField("injured")
	private List<Injured> injuredList;

	/**
	 * 投保城市，六位国标编码
	 */
	@ApiField("insure_city")
	private String insureCity;

	/**
	 * 被保人信息
	 */
	@ApiField("insured")
	private Insured insured;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 报案时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("report_date")
	private Date reportDate;

	/**
	 * 报案号，使用保险公司实际业务流程中的报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求号，每一次请求都需要变化且唯一。可使用UUID实现
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 理赔场景编码，对应实际发生反欺诈调用的场景。
枚举如下：
REPORT:报案
SURVEY:查勘
CLAIMS_ASSESS:核赔
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 标的车信息
报案阶段可选，查勘、核赔阶段必传
	 */
	@ApiField("subject_car")
	private ReportCar subjectCar;

	/**
	 * 三者车数量，上限15辆，如果没有则为0
	 */
	@ApiField("third_party_car_count")
	private Long thirdPartyCarCount;

	/**
	 * 三者车列表，涉及三者车的案件在查勘、核赔阶段必选
	 */
	@ApiListField("third_party_car_list")
	@ApiField("report_car")
	private List<ReportCar> thirdPartyCarList;

	public String getAccidentCity() {
		return this.accidentCity;
	}
	public void setAccidentCity(String accidentCity) {
		this.accidentCity = accidentCity;
	}

	public Date getAccidentDate() {
		return this.accidentDate;
	}
	public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}

	public String getAccidentLocation() {
		return this.accidentLocation;
	}
	public void setAccidentLocation(String accidentLocation) {
		this.accidentLocation = accidentLocation;
	}

	public String getCaseAmount() {
		return this.caseAmount;
	}
	public void setCaseAmount(String caseAmount) {
		this.caseAmount = caseAmount;
	}

	public String getEstimateDamageAmount() {
		return this.estimateDamageAmount;
	}
	public void setEstimateDamageAmount(String estimateDamageAmount) {
		this.estimateDamageAmount = estimateDamageAmount;
	}

	public Informant getInformant() {
		return this.informant;
	}
	public void setInformant(Informant informant) {
		this.informant = informant;
	}

	public Long getInjuredCount() {
		return this.injuredCount;
	}
	public void setInjuredCount(Long injuredCount) {
		this.injuredCount = injuredCount;
	}

	public List<Injured> getInjuredList() {
		return this.injuredList;
	}
	public void setInjuredList(List<Injured> injuredList) {
		this.injuredList = injuredList;
	}

	public String getInsureCity() {
		return this.insureCity;
	}
	public void setInsureCity(String insureCity) {
		this.insureCity = insureCity;
	}

	public Insured getInsured() {
		return this.insured;
	}
	public void setInsured(Insured insured) {
		this.insured = insured;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public Date getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public ReportCar getSubjectCar() {
		return this.subjectCar;
	}
	public void setSubjectCar(ReportCar subjectCar) {
		this.subjectCar = subjectCar;
	}

	public Long getThirdPartyCarCount() {
		return this.thirdPartyCarCount;
	}
	public void setThirdPartyCarCount(Long thirdPartyCarCount) {
		this.thirdPartyCarCount = thirdPartyCarCount;
	}

	public List<ReportCar> getThirdPartyCarList() {
		return this.thirdPartyCarList;
	}
	public void setThirdPartyCarList(List<ReportCar> thirdPartyCarList) {
		this.thirdPartyCarList = thirdPartyCarList;
	}

}
