package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询职业培训考试信息
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:12:34
 */
public class AlipayEbppIndustryCareertrainingExamBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4366112957459586366L;

	/**
	 * ● 湖南省全省:  430000  
● 浙江省-杭州市:  330100  
● 浙江省-杭州市-余杭区:  330110 
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * （用于支付宝一方页面的分类筛选）
	 */
	@ApiField("exam_name")
	private String examName;

	/**
	 * 定义外部评价ID, 与本系统评价关联
	 */
	@ApiField("out_exam_id")
	private String outExamId;

	/**
	 * 页码	
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数: 最大50
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getExamName() {
		return this.examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getOutExamId() {
		return this.outExamId;
	}
	public void setOutExamId(String outExamId) {
		this.outExamId = outExamId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
