package org.ndexbio.model.object;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Task extends NdexExternalObject
{
    private String _description;
    private Priority _priority;
    private int _progress;
    private String _resource;
    private Status _status;
    private TaskType _taskType;
   
    private UUID _taskOwnerId;
    
    
    /**************************************************************************
    * Default constructor.
    **************************************************************************/
    public Task()
    {
        super();
        this._type = this.getClass().getSimpleName();
    }


    
    public String getDescription()
    {
        return this._description;
    }
    
    public void setDescription(String description)
    {
        this._description = description;
    }
    
    public Priority getPriority()
    {
        return _priority;
    }
    
    public void setPriority(Priority priority)
    {
        _priority = priority;
    }
    
    public int getProgress()
    {
        return _progress;
    }
    
    public void setProgress(int progress)
    {
        _progress = progress;
    }
    
    public String getResource()
    {
        return _resource;
    }
    
    public void setResource(String resource)
    {
        _resource = resource;
    }

    public Status getStatus()
    {
        return _status;
    }

    public void setStatus(Status status)
    {
        _status = status;
    }
    
    public TaskType getTaskType()
    {
        return _taskType;
    }
    
    public void setTaskType(TaskType type)
    {
        _taskType = type;
    }



	public UUID getTaskOwnerId() {
		return _taskOwnerId;
	}



	public void setTaskOwnerId(UUID _taskOwnerId) {
		this._taskOwnerId = _taskOwnerId;
	}
}
