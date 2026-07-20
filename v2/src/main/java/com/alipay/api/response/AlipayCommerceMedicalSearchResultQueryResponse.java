package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArticleVo;
import com.alipay.api.domain.SimpleDoctorInfo;
import com.alipay.api.domain.SimpleHospitalInfo;
import com.alipay.api.domain.KeyInfo;
import com.alipay.api.domain.MedicalRecordVo;
import com.alipay.api.domain.Term;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.search.result.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-04 14:21:55
 */
public class AlipayCommerceMedicalSearchResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4694633855134617316L;

	/** 
	 * 活动列表
	 */
	@ApiField("activity_list")
	private String activityList;

	/** 
	 * 科普内容
	 */
	@ApiField("article_list")
	private ArticleVo articleList;

	/** 
	 * 医生信息
	 */
	@ApiField("doctor_info_list")
	private SimpleDoctorInfo doctorInfoList;

	/** 
	 * 是否有更多
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 医院信息
	 */
	@ApiField("hospital_list")
	private SimpleHospitalInfo hospitalList;

	/** 
	 * null
	 */
	@ApiListField("key_list")
	@ApiField("key_info")
	private List<KeyInfo> keyList;

	/** 
	 * 就诊记录信息
	 */
	@ApiField("medical_record_list")
	private MedicalRecordVo medicalRecordList;

	/** 
	 * null
	 */
	@ApiListField("sort_list")
	@ApiField("string")
	private List<String> sortList;

	/** 
	 * 词条信息
	 */
	@ApiField("term_list")
	private Term termList;

	public void setActivityList(String activityList) {
		this.activityList = activityList;
	}
	public String getActivityList( ) {
		return this.activityList;
	}

	public void setArticleList(ArticleVo articleList) {
		this.articleList = articleList;
	}
	public ArticleVo getArticleList( ) {
		return this.articleList;
	}

	public void setDoctorInfoList(SimpleDoctorInfo doctorInfoList) {
		this.doctorInfoList = doctorInfoList;
	}
	public SimpleDoctorInfo getDoctorInfoList( ) {
		return this.doctorInfoList;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setHospitalList(SimpleHospitalInfo hospitalList) {
		this.hospitalList = hospitalList;
	}
	public SimpleHospitalInfo getHospitalList( ) {
		return this.hospitalList;
	}

	public void setKeyList(List<KeyInfo> keyList) {
		this.keyList = keyList;
	}
	public List<KeyInfo> getKeyList( ) {
		return this.keyList;
	}

	public void setMedicalRecordList(MedicalRecordVo medicalRecordList) {
		this.medicalRecordList = medicalRecordList;
	}
	public MedicalRecordVo getMedicalRecordList( ) {
		return this.medicalRecordList;
	}

	public void setSortList(List<String> sortList) {
		this.sortList = sortList;
	}
	public List<String> getSortList( ) {
		return this.sortList;
	}

	public void setTermList(Term termList) {
		this.termList = termList;
	}
	public Term getTermList( ) {
		return this.termList;
	}

}
