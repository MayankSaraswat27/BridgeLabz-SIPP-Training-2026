public class EmployeeSkills {

    static void findTeams(int[] skills,
                          int target,
                          int index,
                          String team,
                          int sum) {

        if (sum == target) {
            System.out.println("[" + team + "]");
            return;
        }

        if (index == skills.length || sum > target)
            return;

        String newTeam;

        if (team.isEmpty())
            newTeam = String.valueOf(skills[index]);
        else
            newTeam = team + "," + skills[index];

        findTeams(skills,
                  target,
                  index + 1,
                  newTeam,
                  sum + skills[index]);

        findTeams(skills,
                  target,
                  index + 1,
                  team,
                  sum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills,
                  target,
                  0,
                  "",
                  0);
    }
}