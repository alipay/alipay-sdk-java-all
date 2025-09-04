package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阅读听书频道卷信息同步接口
 *
 * @author auto create
 * @since 1.0, 2023-07-07 11:43:21
 */
public class AlipayUserAntbookcontentVolumeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2726139558986425695L;

	/**
	 * 书籍ID，可唯一标识一个书籍
	 */
	@ApiField("book_id")
	private String bookId;

	/**
	 * 卷创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 卷名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作类型
ADD：新增操作
UPDATE：更新操作
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 卷排序序号
	 */
	@ApiField("sort_no")
	private Long sortNo;

	/**
	 * 卷更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 卷ID，可唯一标识一个卷
	 */
	@ApiField("volume_id")
	private String volumeId;

	public String getBookId() {
		return this.bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public Long getSortNo() {
		return this.sortNo;
	}
	public void setSortNo(Long sortNo) {
		this.sortNo = sortNo;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getVolumeId() {
		return this.volumeId;
	}
	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
	}

}
