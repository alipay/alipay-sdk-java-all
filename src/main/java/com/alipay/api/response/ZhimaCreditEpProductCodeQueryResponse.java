package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizResData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.product.code.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-18 15:25:01
 */
public class ZhimaCreditEpProductCodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8237348617869938546L;

	/** 
	 * 业务明细信息：
biz_no:业务借据号
biz_date：支用日期
biz_amount:支用金额
biz_user_id:业务消费者唯一标志
	 */
	@ApiListField("biz_info")
	@ApiField("biz_res_data")
	private List<BizResData> bizInfo;

	/** 
	 * 总记录数
	 */
	@ApiField("total_cnt")
	private Long totalCnt;

	public void setBizInfo(List<BizResData> bizInfo) {
		this.bizInfo = bizInfo;
	}
	public List<BizResData> getBizInfo( ) {
		return this.bizInfo;
	}

	public void setTotalCnt(Long totalCnt) {
		this.totalCnt = totalCnt;
	}
	public Long getTotalCnt( ) {
		return this.totalCnt;
	}

}
