package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HospitalCampusRegisterScheduleInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.departmentschedule.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-06 17:32:42
 */
public class AlipayCommerceMedicalLargermodelDepartmentscheduleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3733342173885597935L;

	/** 
	 * 会话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/** 
	 * 医院行政科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/** 
	 * 是否还有更多数据
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 医院主院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

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
	 * 医院排班列表
	 */
	@ApiListField("register_info_list")
	@ApiField("hospital_campus_register_schedule_info_d_t_o")
	private List<HospitalCampusRegisterScheduleInfoDTO> registerInfoList;

	/** 
	 * 科室排班列表页链接，由前端提供
  1. 标准科室排班
  2. 医院科室排班
	 */
	@ApiField("schedule_page_url")
	private String schedulePageUrl;

	/** 
	 * 二级缓存页
	 */
	@ApiField("second_page_key")
	private String secondPageKey;

	/** 
	 * 科室跳转链接，由前端提供
1. 标准科室列表页 无需锚定
2. 医院科室列表页，无需锚定
	 */
	@ApiField("url")
	private String url;

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

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalName( ) {
		return this.hospitalName;
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

	public void setRegisterInfoList(List<HospitalCampusRegisterScheduleInfoDTO> registerInfoList) {
		this.registerInfoList = registerInfoList;
	}
	public List<HospitalCampusRegisterScheduleInfoDTO> getRegisterInfoList( ) {
		return this.registerInfoList;
	}

	public void setSchedulePageUrl(String schedulePageUrl) {
		this.schedulePageUrl = schedulePageUrl;
	}
	public String getSchedulePageUrl( ) {
		return this.schedulePageUrl;
	}

	public void setSecondPageKey(String secondPageKey) {
		this.secondPageKey = secondPageKey;
	}
	public String getSecondPageKey( ) {
		return this.secondPageKey;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
