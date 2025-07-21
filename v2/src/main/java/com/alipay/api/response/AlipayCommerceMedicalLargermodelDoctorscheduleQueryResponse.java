package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DoctorHospitalScheduleInfoDTO;
import com.alipay.api.domain.InquiryServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.doctorschedule.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 10:27:28
 */
public class AlipayCommerceMedicalLargermodelDoctorscheduleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5896634881952416694L;

	/** 
	 * 会话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/** 
	 * 医生执业行政科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/** 
	 * 医生黄页链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/** 
	 * 医生性别
	 */
	@ApiField("doctor_gender")
	private String doctorGender;

	/** 
	 * 外部平台医生Id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/** 
	 * 内部医生id
	 */
	@ApiField("doctor_inner_id")
	private String doctorInnerId;

	/** 
	 * 医生头像
	 */
	@ApiField("doctor_logo")
	private String doctorLogo;

	/** 
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/** 
	 * 学术名称
	 */
	@ApiField("education_title")
	private String educationTitle;

	/** 
	 * 医院特色科室标签
	 */
	@ApiListField("hospital_dep_feature_tags")
	@ApiField("string")
	private List<String> hospitalDepFeatureTags;

	/** 
	 * 医院级别，枚举值
THIRD_CLASS : 三甲
THREE_LEVEL：三级
SECOND_LEVEL：二级
FIRST_LEVEL：一级
HEALTH_CENTER ： 社区卫生服务中心
OTHER ：其他
	 */
	@ApiField("hospital_level")
	private String hospitalLevel;

	/** 
	 * 医生执业医院原始名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/** 
	 * 医院排班列表
	 */
	@ApiListField("hospital_register_info_list")
	@ApiField("doctor_hospital_schedule_info_d_t_o")
	private List<DoctorHospitalScheduleInfoDTO> hospitalRegisterInfoList;

	/** 
	 * 灵知医院主院id
	 */
	@ApiField("hospital_uinq_code")
	private String hospitalUinqCode;

	/** 
	 * 分页key
	 */
	@ApiField("page_key")
	private String pageKey;

	/** 
	 * 外部平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/** 
	 * 医生挂号主页链接 包含：医院院区、医生id
	 */
	@ApiField("register_page_url")
	private String registerPageUrl;

	/** 
	 * 若无排班时，则该字段返回描述内容
	 */
	@ApiField("schedule_desc")
	private String scheduleDesc;

	/** 
	 * 二级缓存页
	 */
	@ApiField("second_page_key")
	private String secondPageKey;

	/** 
	 * 服务信息
	 */
	@ApiListField("service_info_list")
	@ApiField("inquiry_service_info")
	private List<InquiryServiceInfo> serviceInfoList;

	/** 
	 * 医生职称，枚举值：
CHIEF_PHYSICIANS ： 主任医师
DEPUTY_CHIEF_PHYSICIANS ：副主任医师
ATTENDING_PHYSICIANS：主治医师
PHYSICIANS ：医师
	 */
	@ApiField("title")
	private String title;

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}
	public String getChatId( ) {
		return this.chatId;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentName( ) {
		return this.departmentName;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public String getDetailUrl( ) {
		return this.detailUrl;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getDoctorGender( ) {
		return this.doctorGender;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorId( ) {
		return this.doctorId;
	}

	public void setDoctorInnerId(String doctorInnerId) {
		this.doctorInnerId = doctorInnerId;
	}
	public String getDoctorInnerId( ) {
		return this.doctorInnerId;
	}

	public void setDoctorLogo(String doctorLogo) {
		this.doctorLogo = doctorLogo;
	}
	public String getDoctorLogo( ) {
		return this.doctorLogo;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorName( ) {
		return this.doctorName;
	}

	public void setEducationTitle(String educationTitle) {
		this.educationTitle = educationTitle;
	}
	public String getEducationTitle( ) {
		return this.educationTitle;
	}

	public void setHospitalDepFeatureTags(List<String> hospitalDepFeatureTags) {
		this.hospitalDepFeatureTags = hospitalDepFeatureTags;
	}
	public List<String> getHospitalDepFeatureTags( ) {
		return this.hospitalDepFeatureTags;
	}

	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}
	public String getHospitalLevel( ) {
		return this.hospitalLevel;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalName( ) {
		return this.hospitalName;
	}

	public void setHospitalRegisterInfoList(List<DoctorHospitalScheduleInfoDTO> hospitalRegisterInfoList) {
		this.hospitalRegisterInfoList = hospitalRegisterInfoList;
	}
	public List<DoctorHospitalScheduleInfoDTO> getHospitalRegisterInfoList( ) {
		return this.hospitalRegisterInfoList;
	}

	public void setHospitalUinqCode(String hospitalUinqCode) {
		this.hospitalUinqCode = hospitalUinqCode;
	}
	public String getHospitalUinqCode( ) {
		return this.hospitalUinqCode;
	}

	public void setPageKey(String pageKey) {
		this.pageKey = pageKey;
	}
	public String getPageKey( ) {
		return this.pageKey;
	}

	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}
	public String getPlatformCode( ) {
		return this.platformCode;
	}

	public void setRegisterPageUrl(String registerPageUrl) {
		this.registerPageUrl = registerPageUrl;
	}
	public String getRegisterPageUrl( ) {
		return this.registerPageUrl;
	}

	public void setScheduleDesc(String scheduleDesc) {
		this.scheduleDesc = scheduleDesc;
	}
	public String getScheduleDesc( ) {
		return this.scheduleDesc;
	}

	public void setSecondPageKey(String secondPageKey) {
		this.secondPageKey = secondPageKey;
	}
	public String getSecondPageKey( ) {
		return this.secondPageKey;
	}

	public void setServiceInfoList(List<InquiryServiceInfo> serviceInfoList) {
		this.serviceInfoList = serviceInfoList;
	}
	public List<InquiryServiceInfo> getServiceInfoList( ) {
		return this.serviceInfoList;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
