package se.turingturtles.entities;

import java.util.ArrayList;

public class Task {

    private String name;
    private int startWeek;
    private int duration; //number of weeks
    private ArrayList<TeamMember> teamMembers;
    private boolean completion;
    private int totalTeamMembers;

    public Task(String name, int startWeek, int duration){
        this.name = name;
        this.startWeek = startWeek;
        this.duration = duration;
        this.teamMembers = new ArrayList<TeamMember>();
        this.completion = false;
        this.totalTeamMembers = totalTeamMembers();
    }

    public Task(){} //Needed for JSON-file to work

    //--------------------Getters & Setters--------------------
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getStartWeek(){
        return this.startWeek;
    }
    public void setStartWeek(int newStartWeek){ this.startWeek = newStartWeek; }
    public int getDuration(){
        return this.duration;
    }
    public void setDuration(int newDuration){
        this.duration = newDuration;
    }
    public ArrayList<TeamMember> getTeamMembers(){
        return this.teamMembers;
    }
    public boolean getCompletion(){
        return this.completion;
    }
    public void setCompletion(boolean status){
        this.completion = status;
    }
    public int getTotalTeamMembers(){
        return totalTeamMembers;
    }
    //--------------------Methods--------------------
    public void addTeamMember(TeamMember teamMember){
        this.teamMembers.add(teamMember);
        setTotalTeamMembers();
    }
    public void removeTeamMember(TeamMember teamMember){
        this.teamMembers.remove(teamMember);
    }
    public int totalTeamMembers(){
        return this.teamMembers.size();
    }
    public void setTotalTeamMembers(){
        totalTeamMembers = totalTeamMembers();
    }

    @Override
    public String toString() {
        return "Task: " + this.getName() + ", Duration: " + this.getDuration() +
                ", Members working on task: " + this.getTeamMembers();
    }
}
