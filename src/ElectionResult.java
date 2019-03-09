public class ElectionResult {
    double votes_dem;
    double votes_gop;
    double total_votes;
    double per_dem;
    double per_gop;
    double diff;
    double per_point_dif;
    String state_abbr;
    String county_name;
    int combined_flips;


    public ElectionResult(double votes_dem, double votes_gop, double total_votes, double per_dem, double per_gop, double diff, double per_point_dif, String state_abbr, String county_name, int combined_flips) {
        this.votes_dem = votes_dem;
        this.votes_gop = votes_gop;
        this.total_votes = total_votes;
        this.per_dem = per_dem;
        this.per_gop = per_gop;
        this.diff = diff;
        this.per_point_dif = per_point_dif;
        this.state_abbr = state_abbr;
        this.county_name = county_name;
        this.combined_flips = combined_flips;
    }

    public ElectionResult(){

    }

    public void setVotes_dem(double votes_dem) {
        this.votes_dem = votes_dem;
    }

    public void setVotes_gop(double votes_gop) {
        this.votes_gop = votes_gop;
    }

    public void setTotal_votes(double total_votes) {
        this.total_votes = total_votes;
    }

    public void setPer_dem(double per_dem) {
        this.per_dem = per_dem;
    }

    public void setPer_gop(double per_gop) {
        this.per_gop = per_gop;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }

    public void setPer_point_dif(double per_point_dif) {
        this.per_point_dif = per_point_dif;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public void setCombined_flips(int combined_flips) {
        this.combined_flips = combined_flips;
    }
}
