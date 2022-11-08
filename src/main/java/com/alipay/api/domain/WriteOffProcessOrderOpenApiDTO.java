package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核销请求openapi核销Order
 *
 * @author auto create
 * @since 1.0, 2021-12-10 11:49:32
 */
public class WriteOffProcessOrderOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 2657749193468433829L;

	/**
	 * 外部这次请求传入的幂等号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 申请核销的左右手明细单据
	 */
	@ApiListField("write_off_detail_open_api_list")
	@ApiField("write_off_left_right_detail_open_api_d_t_o")
	private List<WriteOffLeftRightDetailOpenApiDTO> writeOffDetailOpenApiList;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<WriteOffLeftRightDetailOpenApiDTO> getWriteOffDetailOpenApiList() {
		return this.writeOffDetailOpenApiList;
	}
	public void setWriteOffDetailOpenApiList(List<WriteOffLeftRightDetailOpenApiDTO> writeOffDetailOpenApiList) {
		this.writeOffDetailOpenApiList = writeOffDetailOpenApiList;
	}

}
