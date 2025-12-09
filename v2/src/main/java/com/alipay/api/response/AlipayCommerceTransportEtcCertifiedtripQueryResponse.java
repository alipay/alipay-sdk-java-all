package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EtcAuthTrip;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.certifiedtrip.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-14 19:12:41
 */
public class AlipayCommerceTransportEtcCertifiedtripQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1747664859676813625L;

	/** 
	 * SUCCESS：订单申请成功； FAIL:申请失败
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 其他业务异常信息描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 行程单据列表
	 */
	@ApiListField("etc_auth_trip")
	@ApiField("etc_auth_trip")
	private List<EtcAuthTrip> etcAuthTrip;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setEtcAuthTrip(List<EtcAuthTrip> etcAuthTrip) {
		this.etcAuthTrip = etcAuthTrip;
	}
	public List<EtcAuthTrip> getEtcAuthTrip( ) {
		return this.etcAuthTrip;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
