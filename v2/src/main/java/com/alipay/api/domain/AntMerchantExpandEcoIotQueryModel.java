package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生态供应商音箱订单查询
 *
 * @author auto create
 * @since 1.0, 2025-11-13 10:20:38
 */
public class AntMerchantExpandEcoIotQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4788421175335379959L;

	/**
	 * 数组，外部业务号
	 */
	@ApiListField("out_biz_nos")
	@ApiField("string")
	private List<String> outBizNos;

	/**
	 * 分页传入的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * sn码
	 */
	@ApiListField("sn")
	@ApiField("string")
	private List<String> sn;

	public List<String> getOutBizNos() {
		return this.outBizNos;
	}
	public void setOutBizNos(List<String> outBizNos) {
		this.outBizNos = outBizNos;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public List<String> getSn() {
		return this.sn;
	}
	public void setSn(List<String> sn) {
		this.sn = sn;
	}

}
