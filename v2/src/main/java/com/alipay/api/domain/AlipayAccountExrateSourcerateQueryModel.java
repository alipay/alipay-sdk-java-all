package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 源汇率查询
 *
 * @author auto create
 * @since 1.0, 2024-10-08 16:46:32
 */
public class AlipayAccountExrateSourcerateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6294679413521279721L;

	/**
	 * 查询截止报价生成时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 报价生成日期。查询结果为大于该报价生成日期的源汇率记录
	 */
	@ApiField("generate_date")
	private String generateDate;

	/**
	 * 报价是否异常。枚举值：Y、N，除此之外都为非法值
	 */
	@ApiField("is_exception")
	private String isException;

	/**
	 * 源汇率编码
	 */
	@ApiField("rate_source_code")
	private String rateSourceCode;

	/**
	 * 查询记录行数。大于0的整数值，最大长度超长则异常
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 查询起始报价生成时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getGenerateDate() {
		return this.generateDate;
	}
	public void setGenerateDate(String generateDate) {
		this.generateDate = generateDate;
	}

	public String getIsException() {
		return this.isException;
	}
	public void setIsException(String isException) {
		this.isException = isException;
	}

	public String getRateSourceCode() {
		return this.rateSourceCode;
	}
	public void setRateSourceCode(String rateSourceCode) {
		this.rateSourceCode = rateSourceCode;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
