package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CircleRecommendItemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.circle.recommenditem.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:01
 */
public class KoubeiMallCircleRecommenditemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8394827226288133424L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误文案
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 是否有更多商品；
true：下一页有商品
false：下一页无商品
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 下一页起始查询值
	 */
	@ApiField("next_start")
	private Long nextStart;

	/** 
	 * 每页查询量，分页长度
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 生活圈推荐商品信息模型
	 */
	@ApiListField("recommend_item")
	@ApiField("circle_recommend_item_d_t_o")
	private List<CircleRecommendItemDTO> recommendItem;

	/** 
	 * 业务请求成功与否;
true：成功 
false：失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setNextStart(Long nextStart) {
		this.nextStart = nextStart;
	}
	public Long getNextStart( ) {
		return this.nextStart;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setRecommendItem(List<CircleRecommendItemDTO> recommendItem) {
		this.recommendItem = recommendItem;
	}
	public List<CircleRecommendItemDTO> getRecommendItem( ) {
		return this.recommendItem;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
