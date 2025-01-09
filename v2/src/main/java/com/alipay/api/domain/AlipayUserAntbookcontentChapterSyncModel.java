package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阅读听书频道章节信息同步接口
 *
 * @author auto create
 * @since 1.0, 2023-08-18 16:20:18
 */
public class AlipayUserAntbookcontentChapterSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6725136561238919753L;

	/**
	 * 书籍ID，可唯一标识一个书籍
	 */
	@ApiField("book_id")
	private String bookId;

	/**
	 * 章节是否免费标识
	 */
	@ApiField("chapter_free")
	private Boolean chapterFree;

	/**
	 * 章节ID，可唯一标识一个章节
	 */
	@ApiField("chapter_id")
	private String chapterId;

	/**
	 * 具体章节小说内容，正文部分
	 */
	@ApiField("content")
	private String content;

	/**
	 * 章节创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 章节最后一次修改时间
	 */
	@ApiField("last_audit_time")
	private Date lastAuditTime;

	/**
	 * 章节名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作类型
- ADD：新增操作
- UPDATE：更新操作
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 章节上架时间
	 */
	@ApiField("shelves_time")
	private Date shelvesTime;

	/**
	 * 章节排序序号，必填且保证准确性
	 */
	@ApiField("sort_no")
	private Long sortNo;

	/**
	 * 章节标签
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 章节格式，仅支持HTML格式，若是TXT格式请按照下文章节内容标准进行转换，若是ePub等文件，暂不支持，若需支持请联系后端技术
	 */
	@ApiField("text_format")
	private String textFormat;

	/**
	 * 章节更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 卷ID，有卷则必填，可唯一标识一个卷
	 */
	@ApiField("volume_id")
	private String volumeId;

	/**
	 * 章节字数
	 */
	@ApiField("word_number")
	private Long wordNumber;

	public String getBookId() {
		return this.bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Boolean getChapterFree() {
		return this.chapterFree;
	}
	public void setChapterFree(Boolean chapterFree) {
		this.chapterFree = chapterFree;
	}

	public String getChapterId() {
		return this.chapterId;
	}
	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastAuditTime() {
		return this.lastAuditTime;
	}
	public void setLastAuditTime(Date lastAuditTime) {
		this.lastAuditTime = lastAuditTime;
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

	public Date getShelvesTime() {
		return this.shelvesTime;
	}
	public void setShelvesTime(Date shelvesTime) {
		this.shelvesTime = shelvesTime;
	}

	public Long getSortNo() {
		return this.sortNo;
	}
	public void setSortNo(Long sortNo) {
		this.sortNo = sortNo;
	}

	public List<String> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public String getTextFormat() {
		return this.textFormat;
	}
	public void setTextFormat(String textFormat) {
		this.textFormat = textFormat;
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

	public Long getWordNumber() {
		return this.wordNumber;
	}
	public void setWordNumber(Long wordNumber) {
		this.wordNumber = wordNumber;
	}

}
