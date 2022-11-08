package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核销结果返回DTO
 *
 * @author auto create
 * @since 1.0, 2021-12-10 11:49:32
 */
public class WriteOffProcessResponseOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 4318888892126791858L;

	/**
	 * 核销明细结果返回DTO
	 */
	@ApiListField("detail_list")
	@ApiField("write_off_process_detail_response_open_api_d_t_o")
	private List<WriteOffProcessDetailResponseOpenApiDTO> detailList;

	/**
	 * 外部幂等值
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public List<WriteOffProcessDetailResponseOpenApiDTO> getDetailList() {
		return this.detailList;
	}
	public void setDetailList(List<WriteOffProcessDetailResponseOpenApiDTO> detailList) {
		this.detailList = detailList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
