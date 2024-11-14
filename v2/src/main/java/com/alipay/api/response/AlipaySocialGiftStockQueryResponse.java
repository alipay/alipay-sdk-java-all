package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gift.stock.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:06
 */
public class AlipaySocialGiftStockQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6849267314986965369L;

	/** 
	 * 可用库存总条数
	 */
	@ApiField("available_count")
	private Long availableCount;

	/** 
	 * 已存在券码列表, 已通过创建接口上传的列表
	 */
	@ApiListField("exist_list")
	@ApiField("string")
	private List<String> existList;

	/** 
	 * 不存券码列表，还未上传过的券码
	 */
	@ApiListField("not_exist_list")
	@ApiField("string")
	private List<String> notExistList;

	/** 
	 * 库存总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}
	public Long getAvailableCount( ) {
		return this.availableCount;
	}

	public void setExistList(List<String> existList) {
		this.existList = existList;
	}
	public List<String> getExistList( ) {
		return this.existList;
	}

	public void setNotExistList(List<String> notExistList) {
		this.notExistList = notExistList;
	}
	public List<String> getNotExistList( ) {
		return this.notExistList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
